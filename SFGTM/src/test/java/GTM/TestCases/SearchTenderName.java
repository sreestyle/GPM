package GTM.TestCases;

import GTM.Modules.TenderModule;

import GTM.utility.BaseClass;
import GTM.utility.ExcelDataProvider;

import org.testng.annotations.Test;


public class SearchTenderName extends BaseClass {
    private static final String TenderName = null;
    @Test
    public static void SearchTender() throws Exception {

    	logger=report.createTest("LogIn to GTM");
        ExcelDataProvider.setExcelFile("Login");
        logger.info("Starting Application");
        logIN(ExcelDataProvider.getCellData(1,0),ExcelDataProvider.getCellData(1,1));
        logger.pass("LogIn Success");
        TenderModule.SearchTenderByName(driver, TenderName);
        //logOut();

    }

}
