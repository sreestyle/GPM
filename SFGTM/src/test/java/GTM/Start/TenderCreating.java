package GTM.Start;

import org.testng.annotations.Test;

import GTM.Modules.TenderModule;

public class TenderCreating extends StartApp{
	
	private static final String TenderName = null;

	@Test
    public static void TenderCreation() throws Exception {
       
       
        
        TenderModule.CreateTenderByName(driver, TenderName);
        logOut();

    }


}
