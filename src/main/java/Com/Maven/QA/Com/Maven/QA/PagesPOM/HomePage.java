package Com.Maven.QA.Com.Maven.QA.PagesPOM;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Com.Maven.QA.Com.Maven.QA.Base.InitialiseBrowser;



public class HomePage  extends InitialiseBrowser{
	
	// declaration 
	
	 
	@FindBys({@FindBy(xpath ="//ul[@id='main-nav']//li/a")}) private List<WebElement> HeaderBtn;
	@FindBy(xpath="//a[text()='Shop']") private WebElement ShopBtn ;
	@FindBy(xpath="//a[text()='My Account']") private WebElement MyAccountBtn;
	@FindBy(xpath="//a[text()='AT Site']") private WebElement AllSiteBtn;
	@FindBy(xpath="//a[text()='Test Cases']") private WebElement TestCasesBtn ;
	@FindBy(xpath="//a[text()='Demo Site']") private WebElement DemoSiteBtn  ;
	@FindBy(xpath="//a[@title='Start shopping']") private WebElement StartShoppingBtn;
//	@FindBy(xpath="//a[@rel='nofollow']") private WebElement AddToCartBtn ;
	@FindBy(xpath="//input[@value='Subscribe']") private WebElement SubsribeBtn;
	@FindBy(xpath="//div[@id='footerwrap']//li//a") private WebElement FooterBtn;
	@FindBys({@FindBy(xpath="//div[@class='accordion-title']//parent::li")}) private  List<WebElement> TestCasesAllScenario;
	@FindBys({@FindBy(xpath="//div[@class='accordion-title']//parent::li//p//span")}) private List<WebElement> CommonTestCasePath;
	
	
	//initiaization 
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Usages
	
	
	public void VerifyHeaderBtn() {
		
		
		for(int i= 0;i<5;i++) {
		String btn = HeaderBtn.get(i).getText();
		System.out.println(btn);
		
		}
		System.out.println("Header verified");
		
	}
	
public void VerifyShopBtn() {
		System.out.println(".........................Printing Main WebDriver elementDriver....................");
	Assert.assertTrue(ShopBtn.isEnabled(), "Shop btn is not enabled");

	Reporter.log("Shop button is verified", true);
	}
public void VerifyMyAccount() {
	Assert.assertTrue(MyAccountBtn.isEnabled(), "MyAccountBtn is not enabled");
	Reporter.log("MyAccountBtn is verified",true);
	
}
public void AllSiteBtn() {
	Assert.assertTrue(AllSiteBtn.isEnabled(), "AllSiteBtn is not enabled");
	Reporter.log("AllSiteBtn is verified",true);
	
}
public void VerifyAllStateBtn() {
	Assert.assertTrue(AllSiteBtn.isEnabled(), "AllSiteBtn is not enabled");
	Reporter.log("AllSiteBtn is verified",true);
	
}
public void TestCasesBtn() {
	Assert.assertTrue(AllSiteBtn.isEnabled(), "AllSiteBtn is not enabled");
	Reporter.log("AllSiteBtn is verified",true);
	
	
}
public void VerifyDemoSiteBtn() {
	Assert.assertTrue(DemoSiteBtn.isEnabled(), "DemoSiteBtn is not enabled");
	Reporter.log("DemoSiteBtn is verified",true);
	
}
public void VerivyStartShoppingBtn() {
	Assert.assertTrue(StartShoppingBtn.isEnabled(), "StartShoppingBtn is not enabled");
	Reporter.log("StartShoppingBtn is verified",true);
}
public void VeryfyAddToCartBtn() {
//	Assert.assertTrue(AddToCartBtn.isEnabled(), "AddToCartBtn is not enabled");
	Reporter.log("AddToCartBtn is verified",true);
}
public void VerifySubsribeBtn() {
	Assert.assertTrue(SubsribeBtn.isEnabled(), "SubsribeBtn is not enabled");
	Reporter.log("SubsribeBtn is verified",true);
}

public void AllTestCasesScenario() throws InterruptedException {
	
	System.out.println("...................................................Printing Test Cases And Test Scenario.....................");
	
//	driver.navigate().refresh();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	 
	TestCasesBtn.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	int sz = TestCasesAllScenario.size();
	
	for(int i=0; i<sz; i++) {
		Thread.sleep(2000);
		WebElement scenario = TestCasesAllScenario.get(i);
		String Allscenario = TestCasesAllScenario.get(i).getText();
		System.out.println(Allscenario);
		
		int c = CommonTestCasePath.size();
		Thread.sleep(2000);
		
		for(int j=0;j<c;j++) {
		
			 scenario.click();
			
			 String TestCase = CommonTestCasePath.get(j).getAttribute("innerText");
			 System.out.println(TestCase);
		}
		
		
		
	}

		System.out.println("TestCasesAllScenario verified");
		
	
}

	

}
