package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjectModel.AddingProductToCartPagecObject;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;

public class AddingProductToCart extends BaseClass {
	
	
	
	@Test
	public void AddingNewProductToCart() throws IOException, InterruptedException {
		
		AddingProductToCartPagecObject apco = new AddingProductToCartPagecObject (driver);
		
		apco.clickOnMyAccount().click();
		apco.clickOnLogin().click();
		
		CommonMethods.handlewait(driver, 10, apco.enterEmail());
		
		apco.enterEmail().sendKeys("ABCXYZ1714210654837@gmail.com");
		apco.enterPassword().sendKeys("PQRS");
		apco.clickOnLoginButton().click();
		
		CommonMethods.handlewait(driver, 10, apco.LoggedinValidation());
		
		CommonMethods.handleAssertion(apco.LoggedinValidation().getText(), Constant.LoginSucessMsg);
	}

}
