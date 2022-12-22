package Com.Maven.QA.Com.Maven.QA.Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Maven.QA.Com.Maven.QA.Base.InitialiseBrowser;
import Com.Maven.QA.Com.Maven.QA.PagesPOM.HomePage;

public class HomePageTest extends InitialiseBrowser {
	
	
    @BeforeClass
    public void setUp() throws EncryptedDocumentException, IOException {
  	  InitBrowser();
    }
    
    @AfterClass 
    public void tearDown() {
  	  driver.close();
    }

    
    @Test
    public void HomePageTestig() throws InterruptedException {
    	
		HomePage hm = new HomePage(driver);
		hm.VerifyHeaderBtn();
		hm.VerifyShopBtn();
		hm.VerifyMyAccount();
		hm.AllSiteBtn();
		hm.	VerifyDemoSiteBtn();
		hm.VeryfyAddToCartBtn();
		hm.AllTestCasesScenario();
    	
    	
    }
	
	

}
