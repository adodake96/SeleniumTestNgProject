package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjectModel.RegistrationPagecObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;

public class VerifyRegistrationTestCases extends BaseClass {

	@Test
	public void verifyRegistrationWithValidData() throws IOException, InterruptedException {

		RegistrationPagecObjects rpo = new RegistrationPagecObjects(driver);
		
		rpo.clickOnMyAccount().click();
		rpo.clickOnRegister().click();
		
		CommonMethods.handlewait(driver, 10, rpo.enterFirstName());
		
		rpo.enterFirstName().sendKeys(Constant.firstname);
		rpo.enterLastName().sendKeys(Constant.lastname);
		rpo.enterEmail().sendKeys(email);
		rpo.enterTelephone().sendKeys(Constant.phone);
		rpo.enterPassword().sendKeys(Constant.password);
		rpo.enterConfirmPassword().sendKeys(Constant.confirmpassword);
		rpo.clickOnNewLetter().click();
		rpo.clickOnAgree().click();
		
		CommonMethods.handlewait(driver, 10, rpo.clickOnContinue());
		
		rpo.clickOnContinue().click();
		
		CommonMethods.handleAssertion(rpo.RegistrationMsgValidation().getText(), Constant.AccCreatedMsg);
	}
	
	@Test
	public void verifyRegistrationWithInvalidData() throws IOException, InterruptedException {

		RegistrationPagecObjects rpo = new RegistrationPagecObjects(driver);
		
		rpo.clickOnMyAccount().click();
		rpo.clickOnRegister().click();
		rpo.clickOnContinue().click();
		
		CommonMethods.handlewait(driver, 10, rpo.FirstNameErrorMsgValidation());
		
		CommonMethods.handleAssertion(rpo.FirstNameErrorMsgValidation().getText(), Constant.InvalidFirstName);
		CommonMethods.handleAssertion(rpo.LastNameErrorMsgValidation().getText(), Constant.InvalidLastName);
		CommonMethods.handleAssertion(rpo.EmailErrorMsgValidation().getText(), Constant.InvalidEmail);
		CommonMethods.handleAssertion(rpo.TelephoneErrorMsgValidation().getText(), Constant.InvalidTelephone);
		CommonMethods.handleAssertion(rpo.PasswordErrorMsgValidation().getText(), Constant.InvalidPassword);
		
	}

}
