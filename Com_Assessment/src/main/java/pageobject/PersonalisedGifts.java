package pageobject;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.PersonalisedGiftDetails;

public class PersonalisedGifts  extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	@Test
	public void PersonalizedGiftTest() throws InterruptedException {
		
		
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");	
	
	  PersonalisedGiftDetails p=new PersonalisedGiftDetails(driver);
	  p.getPgifts().click();
	  p.getFeatures().click();
	  p.getBest().click();
	  Thread.sleep(3000);
	 
	  Assert.assertEquals( p.getBook().getText(), "Personalized Moon Lamp - COD Not Available");
	  log.info("Assertion passed");
	  Thread.sleep(2000);
	  
	  
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}
	

}
