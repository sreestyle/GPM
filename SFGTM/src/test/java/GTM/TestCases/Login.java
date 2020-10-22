	package GTM.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GTM.locators.SFLogInLocators;


public class Login {
	
	static WebDriver driver;
		
		@Test
		public static WebDriver logInApp() throws AWTException, InterruptedException
		{
			Thread.sleep(5000);
			
			SFLogInLocators.UserName(driver, "username").sendKeys("gpmdemo3009@modeln.com");
			SFLogInLocators.Password(driver, "password").sendKeys("Demo@123");
			SFLogInLocators.Loginbutton(driver).click();
			System.out.println("Login pass");
			
			return driver;
			
			
		}

}
