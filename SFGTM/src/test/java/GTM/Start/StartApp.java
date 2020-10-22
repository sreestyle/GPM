package GTM.Start;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import GTM.locators.SFLogInLocators;
import GTM.utility.BrowserFactory;


public class StartApp {

    public static WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException, IOException {
    
       driver = BrowserFactory.startApplication(driver, "Chrome", "https://login.salesforce.com/");
        //login
       SFLogInLocators.UserName(driver, "username").sendKeys("gpmdemo3009@modeln.com");
       SFLogInLocators.Password(driver, "password").sendKeys("Demo@123");
       SFLogInLocators.Loginbutton(driver).click();
        //log.info("Logged In sucessfully");
       System.out.println("Login pass");
   }
    public static WebDriver logOut(){
        SFLogInLocators.LogOut(driver).click();
        return driver;
    }
   
	/*@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}*/
}
