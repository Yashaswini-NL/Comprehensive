package uistore;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninDetails {
	public WebDriver driver;
	By signin = By.xpath("//*[@id='myheader']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]/span");
	By email = By.xpath("//*[@id='CustomerEmail']");
	By password = By.xpath("//*[@id='CustomerPassword']");
	By signButton = By.xpath("//*[@id='customer_login']/p[1]/input");

	public SigninDetails(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSignin() {
		return driver.findElement(signin);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSigninButton() {
		return driver.findElement(signButton);
	}
}

