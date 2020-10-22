package GTM.TestCases;

import GTM.utility.BaseClass;
import GTM.utility.ExcelDataProvider;

import org.testng.annotations.Test;

import GTM.Modules.TenderModule;


public class CreateTender extends BaseClass{

   
    @Test
    public static void TenderCreation() throws Exception {

		logger=report.createTest("LogIn to GTM");
        ExcelDataProvider.setExcelFile("Login");
        logger.info("Starting Application");
        logIN(ExcelDataProvider.getCellData(1,0),ExcelDataProvider.getCellData(1,1));
        logger.pass("LogIn Success");
        TenderModule.CreateTenderByName(driver,ExcelDataProvider.getCellData(1,2));
        logOut();
        

    }


}

