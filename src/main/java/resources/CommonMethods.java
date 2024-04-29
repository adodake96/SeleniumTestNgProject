package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleAssertion(String Actual, String Expected){
		
		SoftAssert sa = new SoftAssert();
		
		String ActualText = Actual;
		String ExpectedText = Expected;
	
		sa.assertEquals(ActualText,ExpectedText);
		sa.assertAll();	
	}
	
	public static void handlewait(WebDriver driver3, int time, WebElement element) {
		
		WebDriverWait Wait = new WebDriverWait(driver3,Duration.ofSeconds(time));
		
		Wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
