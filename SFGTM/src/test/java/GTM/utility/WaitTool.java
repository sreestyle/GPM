package GTM.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class WaitTool {

	public static void wait(WebDriver driver, int t)
	{
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(t, TimeUnit.SECONDS);
	}
}
