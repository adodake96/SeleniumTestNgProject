package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPagecObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;

public class VerifyLoginTestCases extends BaseClass {

	@Test
	public void verifyRegistrationWithValidData() throws IOException, InterruptedException {
		
		LoginPagecObjects lpo = new LoginPagecObjects(driver);
		
		lpo.clickOnMyAccount().click();
		lpo.clickOnLogin().click();
		
		CommonMethods.handlewait(driver, 10, lpo.enterEmail());
		
		lpo.enterEmail().sendKeys("ABCXYZ1714210654837@gmail.com");
		lpo.enterPassword().sendKeys("PQRS");
		lpo.clickOnLoginButton().click();
		
		CommonMethods.handlewait(driver, 10, lpo.LoggedinValidation());
		
		CommonMethods.handleAssertion(lpo.LoggedinValidation().getText(), Constant.LoginSucessMsg);
	}

	@Test
	public void verifyRegistrationWithInvalidData() throws IOException, InterruptedException {

		LoginPagecObjects lpo = new LoginPagecObjects(driver);

		lpo.clickOnMyAccount().click();
		lpo.clickOnLogin().click();
		lpo.clickOnLoginButton().click();
		
		CommonMethods.handlewait(driver, 10, lpo.LoggedinFailCheckValidation());
		
		CommonMethods.handleAssertion(lpo.LoggedinFailCheckValidation().getText(), Constant.LoginFailMsg);

	}

}
