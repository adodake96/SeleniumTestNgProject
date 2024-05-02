package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddingProductToCartPagecObject {

	WebDriver driver;

	private By MyAccount = By.xpath("//a[@title='My Account']");
	private By Login = By.xpath("//a[text()='Login']");
	private By Email = By.xpath("//input[@name='email']");
	private By Password = By.xpath("//input[@name='password']");
	private By LoginButton = By.xpath("//input[@value='Login']");
	private By LoggedinCheck = By.xpath("//h2[text()='My Account']");

	public AddingProductToCartPagecObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickOnMyAccount() {

		return driver.findElement(MyAccount);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(Login);

	}

	public WebElement enterEmail() {
		return driver.findElement(Email);
	}

	public WebElement enterPassword() {
		return driver.findElement(Password);
	}

	public WebElement clickOnLoginButton() {
		return driver.findElement(LoginButton);
	}

	public WebElement LoggedinValidation() {
		return driver.findElement(LoggedinCheck);
	}

}
