package GTM.utility;


import GTM.locators.SFLogInLocators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {


	public static WebDriver driver;
	 public static ExcelDataProvider excel;
	 public static ExtentReports report;
	 public static ExtentTest logger;
	 
	 

	    public static WebDriver getDriverInstance() {
	        return driver;
	    }
	    
	    @BeforeSuite
	    public void setUpSuite()
	    {
	    	excel = new ExcelDataProvider();
	    	
	    	ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/GTM_"+Helper.getCurrentDateTime()+".html"));
	    	report = new ExtentReports();
	    	report.attachReporter(extent);
	    	
	    }
  

    @BeforeTest
    public static WebDriver InitilizeBrowser12() {
        //String url = Constants.URL;
        driver = BrowserFactory.startApplication(driver, "Chrome",Constants.URL);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver logIN(String p_UserName, String p_Password) throws Exception {
        Thread.sleep(5000);

        SFLogInLocators.UserName(driver, "Username").sendKeys(p_UserName);
        SFLogInLocators.Password(driver, "Password").sendKeys(p_Password);
        SFLogInLocators.Loginbutton(driver).click();
        System.out.println("Login pass");
        return driver;
    }

    public static WebDriver logOut(){
        SFLogInLocators.LogOut(driver).click();
        return driver;
    }

   /*@AfterTest
    public void teardown() {
        BrowserFactory.quitBrowser(driver);
    }*/
   
   @AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException //ITestResult is suppate interface
	{
		if (result.getStatus()==ITestResult.FAILURE) 
		{
			
			logger.fail("Test Failed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		
		{
			logger.pass("Test passed ", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());

		}
		
		report.flush();
		}
}
