package pageobject;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.CorporateGiftDetails;

public class CorporateGifts extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void GiftPageTest() throws InterruptedException {

		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log.info("navigation to url");
		CorporateGiftDetails c = new CorporateGiftDetails(driver);
		c.getCorporate().click();
		c.getFullName().sendKeys("Yashaswini");
		c.getEmail().sendKeys("yashaswinin26@gmail.com");
		c.getPhone().sendKeys("123456789");
		c.getDesc().sendKeys("this is description");
		c.getSubmit().click();
		log.info("Submitted successfully");

	}

	@AfterTest
	public void close() {

		driver.quit();

	}

}