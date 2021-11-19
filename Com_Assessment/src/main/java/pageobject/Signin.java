package pageobject;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.SigninDetails;

public class Signin extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void SigninTest() throws InterruptedException {
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
		
		SigninDetails sin = new SigninDetails(driver);
		sin.getSignin().click();
		Thread.sleep(5000);
		sin.getEmail().sendKeys("yashaswinin26@gmail.com");
		sin.getPassword().sendKeys("gopi1234");
		//popup
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
	    
		
		sin.getSigninButton().click();
		Thread.sleep(7000);
		
		
		
	}
	
	
	  @AfterTest public void close() {
	  
	  driver.close(); driver=null;
	  
	  }
	 

}
