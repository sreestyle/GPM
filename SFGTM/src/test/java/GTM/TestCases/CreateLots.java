package GTM.TestCases;

import GTM.Modules.TenderModule;

import GTM.utility.BaseClass;
import GTM.utility.ExcelDataProvider;

import org.testng.annotations.Test;

public class CreateLots extends BaseClass {
    private static final String TenderName = null;
    

    @Test
    public static void LotCreation() throws Exception {
    	logger=report.createTest("LogIn to GTM");
        ExcelDataProvider.setExcelFile("Login");
        logger.info("Starting Application");
        logIN(ExcelDataProvider.getCellData(1, 0), ExcelDataProvider.getCellData(1, 1));
        logger.pass("LogIn Success");
        TenderModule.SearchTenderByName(driver, TenderName);
        logger.pass("Searching Sucess");
        TenderModule.LotsDetails(driver);
        logger.pass("New Sucess");
        
    }
}
