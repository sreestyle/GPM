package GTM.Modules;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import GTM.locators.SFProposalsLocators;

public class TenderModule {


    public static void CreateTenderByName(WebDriver driver, String TenderName) throws InterruptedException, IOException {


        Thread.sleep(6000);

        SFProposalsLocators.ClickProposals(driver).click();
        Thread.sleep(3000);
        SFProposalsLocators.ClickNewButton(driver).click();
        Thread.sleep(3000);
        SFProposalsLocators.TerritoryDrpdwnClick(driver).click();
        Thread.sleep(3000);
        SFProposalsLocators.selectTerritory("USA", driver);
        Thread.sleep(3000);
        //-------From Excel TenderName-----------
        SFProposalsLocators.TenderName(driver).sendKeys(TenderName + SFProposalsLocators.getRandomNo());
        //-----------Given Random Name------------------
        //SFProposalsLocators.TenderName(driver).sendKeys("SF001"+SFProposalsLocators.getRandomNo());
        Thread.sleep(3000);
        SFProposalsLocators.clickaccountbox(driver).sendKeys("Acme");
        Thread.sleep(7000);
        SFProposalsLocators.selectaccount(driver).click();
        Thread.sleep(3000);
        SFProposalsLocators.enterdescriptiontext(driver).sendKeys("Test Tender Creation");
        Thread.sleep(3000);
        SFProposalsLocators.CurrencyDrpdwnClick(driver).click();
        Thread.sleep(3000);
        SFProposalsLocators.selectCurrency("USD", driver);
        Thread.sleep(3000);
        SFProposalsLocators.clicktemplatebox(driver).sendKeys("Internal EM");
        Thread.sleep(3000);
        SFProposalsLocators.selecttemplate(driver).click();
        Thread.sleep(3000);
        SFProposalsLocators.selectSubmissionDate(driver).sendKeys("8/1/2020");
        Thread.sleep(3000);
        SFProposalsLocators.selectPotentialStartDate(driver).sendKeys("9/11/2020");
        Thread.sleep(3000);
        SFProposalsLocators.ClickSaveBtn(driver).click();
        Thread.sleep(5000);

    }

    //Search Proposals
    public static void SearchTenderByName(WebDriver driver, String TenderName) throws InterruptedException, IOException {
        Thread.sleep(8000);
        SFProposalsLocators.ClickProposals(driver).click();
        Thread.sleep(7000);
        //SFProposalsLocators.ClickSearchlistBox(driver);
        //Thread.sleep(3000);
        //SFProposalsLocators.SearchEnterTenderName(driver).sendKeys("healthCare57");
        //SFProposalsLocators.ClickOutSide(driver).click();
        SFProposalsLocators.ClickTender(driver).click();
        Thread.sleep(10000);
    }
    //Lots Details
    public static void LotsDetails(WebDriver driver) throws InterruptedException, IOException {
        Thread.sleep(10000);
        //driver.get("https://gtm09demo.lightning.force.com/lightning/r/REVVY__MnTender__c/a5N3j000000DRFDEA4/view");
        //driver.navigate().refresh();
        //Thread.sleep(10000);
//        SFProposalsLocators.ClickLotsDetails(driver).click();

        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        windows.forEach(window->driver.switchTo().window(window));
        SFProposalsLocators.ClickNewForCreateLots(driver).click();
        Thread.sleep(5000);
        
    }
    
  //Click on New for create lots 
   // public static void CreateLots(WebDriver driver) throws InterruptedException, IOException {
    	//Thread.sleep(5000);
    	//SFProposalsLocators.ClickNewForCreateLots(driver).click();
    	
   // }

}
