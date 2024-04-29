package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPagecObjects {

	public WebDriver driver;

	// we will store locators here

	private By MyAccount = By.xpath("//a[@title='My Account']");
	private By Register = By.xpath("//a[text()='Register']");
	private By FirstName = By.xpath("//input[@name='firstname']");
	private By LastName = By.xpath("//input[@name='lastname']");
	private By Email = By.xpath("//input[@name='email']");
	private By Telephone = By.xpath("//input[@name='telephone']");
	private By Password = By.xpath("//input[@name='password']");
	private By Confirm = By.xpath("//input[@name='confirm']");
	private By NewLetter = By.xpath("//input[@name='newsletter']");
	private By Agree = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");
	private By RegistrationSucessMsg = By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By FirstNameErrorMsg = By.xpath("//div[text()=\"First Name must be between 1 and 32 characters!\"]");
	private By LastNameErrorMsg  = By.xpath("//div[text()=\"Last Name must be between 1 and 32 characters!\"]");
	private By EmailErrorMsg = By.xpath("//div[text()=\"E-Mail Address does not appear to be valid!\"]");
	private By TelephoneErrorMsg  = By.xpath("//div[text()=\"Telephone must be between 3 and 32 characters!\"]");
	private By PasswordErrorMsg  = By.xpath("//div[text()=\"Password must be between 4 and 20 characters!\"]");
	
	
	//create constructor to avoid getting driver out of scope
		
	public RegistrationPagecObjects(WebDriver driver2) {
	this.driver=driver2;
	}

	public WebElement clickOnMyAccount() {

		return driver.findElement(MyAccount);
	}
	
	public WebElement clickOnRegister() {

		return driver.findElement(Register);
	}
	
	public WebElement enterFirstName() {

		return driver.findElement(FirstName);
	}
	
	public WebElement enterLastName() {

		return driver.findElement(LastName);
	}
	
	public WebElement enterEmail() {
		
		

		return driver.findElement(Email);
	}
	
	public WebElement enterTelephone() {

		return driver.findElement(Telephone);
	}
	
	public WebElement enterPassword() {

		return driver.findElement(Password);
	}
	
	public WebElement enterConfirmPassword() {

		return driver.findElement(Confirm);
	}
	
	public WebElement clickOnNewLetter() {

		return driver.findElement(NewLetter);
	}
	
	public WebElement clickOnAgree() {

		return driver.findElement(Agree);
	}
	
	public WebElement clickOnContinue() {

		return driver.findElement(Continue);
	}
	
	public WebElement RegistrationMsgValidation() {

		return driver.findElement(RegistrationSucessMsg);
	}
	
	public WebElement FirstNameErrorMsgValidation() {

		return driver.findElement(FirstNameErrorMsg);
	}
	
	public WebElement LastNameErrorMsgValidation() {

		return driver.findElement(LastNameErrorMsg);
	}
	
	public WebElement EmailErrorMsgValidation() {

		return driver.findElement(EmailErrorMsg);
	}
	
	public WebElement TelephoneErrorMsgValidation() {

		return driver.findElement(TelephoneErrorMsg);
	}
	
	public WebElement PasswordErrorMsgValidation() {

		return driver.findElement(PasswordErrorMsg);
	}

}
