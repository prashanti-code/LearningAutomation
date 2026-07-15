package BatchExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class Ts_03 extends BaseConfig {
	 @Test()
	    public void createProduct() {
	    	WebElement product=driver.findElement(By.xpath("//a[text()='Products']"));
	    	product.click();
	    	Reporter.log("Creating Product success");
     }
}
