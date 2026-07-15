package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class Task {
		 	@BeforeClass
		 	public void browserSetup() {
		 		Reporter.log("Browser Opened",true);
		 		Reporter.log("Browser Maximized",true);
		 		Reporter.log("Nav To App via URL",true);
		 		
		 	}
		 	
		     @BeforeMethod
		     public void login() {
		     	Reporter.log("Entered un in Untxtfld",true);
		 	    Reporter.log("Entered pswd in pswdtxtfld",true);
		 	    Reporter.log("click on login btn",true);
		 	
		     }
		     
		     @Test()
		     public void createOrg() {
		     	Reporter.log("Creating Org Success",true);
		     	
		     }
		     
		 
		     @Test
		     public void updateOrg() {
		    	 Reporter.log("Updating organization org success", true);
		     }
		     
		     @Test
		     public void deleteOrg() {
		    	 Reporter.log("deleting org success", true);
		     }
		     
		     @AfterMethod
		     public void logout()  {
		    	 Reporter.log("Creating org success", true); 
		 }
		     
		     @AfterClass
		     public void BrowserTerminate() {
		    	 Reporter.log("Browser closed", true);
		     }
}
