package Com.Maven.QA.Com.Maven.QA.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Maven.QA.Com.Maven.QA.Utilities.Utilities;


public class InitialiseBrowser {
	public static WebDriver driver;
	
	public static void InitBrowser() throws EncryptedDocumentException, IOException {
		
		Utilities ut = new Utilities();
		String url = ut.ReadFromExcel(0, 0);
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}

}
