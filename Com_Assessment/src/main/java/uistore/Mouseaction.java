package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	 WebDriver driver;
	 By imagemovment=By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[7]/div/a/div[1]");
	 By allofit =By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[12]/a");
	 
	 public Mouseaction(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public WebElement getimagemovment()
	 {
		 return driver.findElement(imagemovment);
	 }
	 public WebElement getallofit()
	 {
		 return driver.findElement(allofit);
	 }

}
