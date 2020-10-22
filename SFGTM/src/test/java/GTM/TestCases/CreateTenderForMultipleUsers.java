package GTM.TestCases;

import GTM.Modules.TenderModule;

import GTM.utility.BaseClass;
import GTM.utility.ExcelDataProvider;

import org.testng.annotations.Test;

public class CreateTenderForMultipleUsers extends BaseClass {

    @Test
    public static void TenderCreation() throws Exception {
        //excelSheet = new ExcelData("./TestData/GTMData.xlsx");
    	ExcelDataProvider.setExcelFile("Login");
        for (int i = 1; i <= 2; i++) {
            logIN(ExcelDataProvider.getCellData(i, 0), ExcelDataProvider.getCellData(i, 1));
            TenderModule.CreateTenderByName(driver, ExcelDataProvider.getCellData(i, 2));
            Thread.sleep(5000);
            logOut();
            Thread.sleep(5000);
        }
    }
}
