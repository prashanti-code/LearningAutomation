package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class Ts_01 extends BaseConfig {
	 @Test()
	    public void createOrg() {
	    	WebElement org=driver.findElement(By.xpath("//a[text()='Organizations']"));
	    	org.click();
	    	Reporter.log("Creating Org success");
     }
}
