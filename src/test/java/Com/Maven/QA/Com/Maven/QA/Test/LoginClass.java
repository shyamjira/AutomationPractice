package Com.Maven.QA.Com.Maven.QA.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Maven.QA.Com.Maven.QA.Base.InitialiseBrowser;
import Com.Maven.QA.Com.Maven.QA.PagesPOM.LoginPage;

public class LoginClass extends InitialiseBrowser  {

      @BeforeClass
      public void setUp() throws EncryptedDocumentException, IOException {
    	  InitBrowser();
      }
      
      @AfterClass 
      public void tearDown() {
    	  driver.close();
      }
	
	@Test
	public void LoginPageTest() throws EncryptedDocumentException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyMyAccountBtn();
		lp.verifyUsername();
		lp.verifyPassword();
		lp.verifyLoginBtn();
	}
	
	
		
	}

