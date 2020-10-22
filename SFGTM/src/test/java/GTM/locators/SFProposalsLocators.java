package GTM.locators;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFProposalsLocators {

    

	//Create Tender
    public static WebElement ClickProposals(WebDriver driver) {
        WebElement ClickProposals = driver.findElement(By.xpath("//*[@title='Proposals']/ancestor::one-app-nav-bar-item-root"));
        return ClickProposals;
    }


    public static WebElement ClickNewButton(WebDriver driver) {
        WebElement ClickNewButton = driver.findElement(By.xpath("//div[contains(text(),'New')]"));
        return ClickNewButton;

    }


    //Proposal details

    public static WebElement TerritoryDrpdwnClick(WebDriver driver) {

        return driver.findElement(By.xpath("//div[contains(@id,'35:')]"));
    }

    public static void selectTerritory(String menuItem, WebDriver driver) {
        List<WebElement> TerritoryList = driver.findElements(By.xpath("//a[contains(text(),'USA')]"));
        for (WebElement menuItemWebElement : TerritoryList) {
            if (menuItemWebElement.getText().equalsIgnoreCase(menuItem)) {
                menuItemWebElement.click();
            }
        }
    }

    //Random Text/Number in input fields
    public static int getRandomNo() {
        Random rand = new Random();
        int i = rand.nextInt(1000);
        return i;
    }


    public static WebElement TenderName(WebDriver driver) {

        WebElement TenderName = driver.findElement(By.xpath("//input[contains(@id,'88:')]"));
        return TenderName;

    }

    public static WebElement clickaccountbox(WebDriver driver) {
        WebElement accountbox = driver.findElement(By.xpath("//input[contains(@id,'104:')]"));
        return accountbox;
    }

    public static WebElement selectaccount(WebDriver driver) {
        WebElement selectaccount = driver.findElement(By.xpath("//mark[contains(text(),'Acme')]"));
        return selectaccount;
    }

    public static WebElement enterdescriptiontext(WebDriver driver) {
        WebElement descriptiontext = driver.findElement(By.xpath("//textarea[contains(@id,'194:')]"));
        return descriptiontext;
    }

    public static WebElement CurrencyDrpdwnClick(WebDriver driver) {

        return driver.findElement(By.xpath("//div[contains(@id,'227:')]"));
    }

    public static void selectCurrency(String menuItem, WebDriver driver) {
        List<WebElement> CurrencyList = driver.findElements(By.xpath("//a[contains(text(),'USD')]"));
        for (WebElement menuItemWebElement : CurrencyList) {
            if (menuItemWebElement.getText().equalsIgnoreCase(menuItem)) {
                menuItemWebElement.click();
            }
        }
    }

    public static WebElement clicktemplatebox(WebDriver driver) {
        WebElement templatebox = driver.findElement(By.xpath("//input[contains(@id,'280:')]"));
        return templatebox;
    }

    public static WebElement selecttemplate(WebDriver driver) {
        WebElement selecttemplate = driver.findElement(By.xpath("//mark[contains(text(),'Internal')]"));
        return selecttemplate;
    }

    public static WebElement selectSubmissionDate(WebDriver driver) {
        WebElement SubmissionDate = driver.findElement(By.xpath("//input[contains(@id,'416:')]"));
        return SubmissionDate;
    }

    public static WebElement selectPotentialStartDate(WebDriver driver) {
        WebElement PotentialStartDate = driver.findElement(By.xpath("//input[contains(@id,'499:')]"));
        return PotentialStartDate;
    }

    public static WebElement ClickSaveBtn(WebDriver driver) {
        WebElement SaveBtn = driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton')]//span[contains(@class,'label bBody')][contains(text(),'Save')]"));
        return SaveBtn;
    }

    //Search Proposals

    public static WebElement SearchEnterTenderName(WebDriver driver) {
        WebElement EnterTenderName = driver.findElement(By.xpath("//input[contains(@name, 'REVVY__MnTender__c-search-input')]"));
        return EnterTenderName;
    }
    public static WebElement ClickOutSide(WebDriver driver) {
        WebElement ClickOutSide = driver.findElement(By.xpath("//div[@class='slds-media__body slds-align-middle']//div[@class='slds-grid']"));
        return ClickOutSide;
    }
    public static WebElement ClickTender(WebDriver driver) {//tendername=healthcare57
        WebElement ClickTender = driver.findElement(By.xpath("//a[contains(@title, 'healthCare57')]"));
        return ClickTender;
    }
    //Lots Details
    public static WebElement ClickLotsDetails(WebDriver driver) {
        WebElement ClickLotsDetails = driver.findElement(By.xpath("//a[@id='customTab2__item']"));
        return ClickLotsDetails;
    }
    //Click on New for create lots

    public static WebElement ClickNewForCreateLots(WebDriver driver) {
    	//Actions action = new Actions(WebDriver);
    	WebElement ClickNewForCreateLots = driver.findElement(By.xpath("//*[contains(text(),'Manage Lot Structure')]"));
    	return ClickNewForCreateLots;
    	
    	//action.moveToElement(CreateLots).build().perform();
    	
    	//return CreateLots;
    	/*By button = By.xpath("//div[contains(text(),'New')]");
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(button));
    	driver.findElement(button);
		return null;*/
    	
    }






}
