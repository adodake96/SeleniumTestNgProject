package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjectModel.LoginPagecObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;

public class VerifyLoginTestCases extends BaseClass {

	@Test
	public void verifyLoginWithValidData() throws IOException, InterruptedException {
		
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
	public void verifyLoginWithInvalidData() throws IOException, InterruptedException {

		LoginPagecObjects lpo = new LoginPagecObjects(driver);

		lpo.clickOnMyAccount().click();
		lpo.clickOnLogin().click();
		lpo.clickOnLoginButton().click();
		
		CommonMethods.handlewait(driver, 10, lpo.LoggedinFailCheckValidation());
		
		CommonMethods.handleAssertion(lpo.LoggedinFailCheckValidation().getText(), Constant.LoginFailMsg);

	}

}
