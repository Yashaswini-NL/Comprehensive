package pageobject;

	import java.io.IOException;

	import org.apache.log4j.Logger;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import reusablecomponents.ReadPropertyFile;
import uistore.SearchDetails;

	public class SearchPage extends ReadPropertyFile {
		
		
		public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

		@BeforeTest
		public void initialise() throws IOException {
			
			driver=DriverInitialisation();
		}
		@Test
		public void SearchPageTest() throws InterruptedException {
			
			
			
			driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			Thread.sleep(3000);
			log.info("navigation to url");	
		
			
			SearchDetails s=new SearchDetails(driver);
			s.getSearch().sendKeys("harry potter gifts");
			log.info("navigated to harry porter gifs page");
			s.getHarry().click();
			
			Assert.assertEquals(s.getImage().getText(), "Harry Potter Plush Soft Toy");
			
		}
		@AfterTest
		public void close() {
			
			driver.quit();
			
		}
	}

