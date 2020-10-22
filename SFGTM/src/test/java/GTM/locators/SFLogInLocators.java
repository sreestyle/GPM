package GTM.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SFLogInLocators {
	
	public static WebElement UserName(WebDriver driver, String FieldName)
	{
		WebElement UserName= driver.findElement(By.id("username"));
		return UserName;
	}
	
	public static WebElement Password(WebDriver driver, String FieldName)
	{
		WebElement Password= driver.findElement(By.id("password"));
		return Password;
	}
	
	public static WebElement Loginbutton(WebDriver driver)
	{
		WebElement Loginbutton= driver.findElement(By.id("Login"));
		return Loginbutton;
	}

	public static WebElement LogOut(WebDriver driver)
	{
		WebElement UserProfileBtn= driver.findElement(By.xpath("//img[@title='User']"));
		UserProfileBtn.click();
		WebElement LogOutButton= driver.findElement(By.xpath("//a[text()='Log Out']"));
		return LogOutButton;
	}
}
