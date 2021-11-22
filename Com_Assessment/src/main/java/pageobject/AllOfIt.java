package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Systematiser;

import reusablecomponents.ReadPropertyFile;
import uistore.Allofit;

public class AllOfIt extends ReadPropertyFile {
public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void AllOfItTest() throws InterruptedException {
		Allofit a=new Allofit(driver);
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		a.getallofit().click();
		a.getitem().click();
		log.info("clicked on selected item");
		Thread.sleep(3000);
		a.getaddtocart().click();
		log.info("added to cart");
		Thread.sleep(3000);
		a.getgiftwrap().click();
		a.getgiftnote().click();
		Thread.sleep(3000);
		a.getfromdetails().sendKeys("Vamsiii");
		a.gettodetails().sendKeys("yash");
		a.getmessage().sendKeys("Christmas Gift");
		Thread.sleep(3000);
		System.out.println(a.gettotal().getText());
		
		System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
	    Thread.sleep(3000);
		
		a.getContinueShopping().click();
		log.info("returned to home page");
		Thread.sleep(3000);
		a.getallofit().click();
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
		driver=null;

}
}
