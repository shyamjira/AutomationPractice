package Com.Maven.QA.Com.Maven.QA.PagesPOM;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ulp;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Com.Maven.QA.Com.Maven.QA.Base.InitialiseBrowser;
import Com.Maven.QA.Com.Maven.QA.Utilities.Utilities;


public class LoginPage extends InitialiseBrowser{
	
	
	// declaration 
	@FindBy(xpath="//a[text()='My Account']") private WebElement MyAccountBtn;
	@FindBy(xpath = "//input[@id='username']") private WebElement Username;
	@FindBy(xpath = "//input[@id='password']") private WebElement Password;
	@FindBy(xpath = "//input[@name='login']") private WebElement LoginBtn;
	
	
	// initialization
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	

	// Usage
	
	
	
	Utilities ul = new Utilities();
	
	public void verifyUsername() throws EncryptedDocumentException, IOException {
		
		String name = ul.ReadFromExcel(1, 0);
		Assert.assertTrue(Username.isEnabled(), "username is not enabled");
		Username.sendKeys(name);
		Reporter.log("username field is verified", true);
		
		
	}
	
     public void verifyPassword() throws EncryptedDocumentException, IOException {
 		String pass = ul.ReadFromExcel(2, 0);
 		Password.sendKeys(pass);
    	 Assert.assertTrue(Password.isEnabled(), "password is not enabled");
 		Reporter.log("password field is verified", true);
		
	}
     
     public void verifyLoginBtn() {
    	 Assert.assertTrue(LoginBtn.isEnabled(), "LoginBtn is not enabled");
  		Reporter.log("LoginBtn field is verified", true);
  		LoginBtn.click();
  		
 	}
     
     public void verifyMyAccountBtn() {
    	 Assert.assertTrue(MyAccountBtn.isEnabled(), "LoginBtn is not enabled");
  		Reporter.log("MyAccount field is verified", true);
 		MyAccountBtn.click();
 	}
 	
	
	
	
	
	

}
