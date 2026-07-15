package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseConfig {
	public WebDriver driver;
	@BeforeClass
	public void browserSetup() {
		driver=new EdgeDriver();
		driver.get("http://49.249.29.4:8888/");
		Reporter.log("Browser Opened",true);
 		Reporter.log("Browser Maximized",true);
 		Reporter.log("Nav To App via URL",true);
	}
	
    @BeforeMethod
    public void login() {
    	WebElement name=driver.findElement(By.name("user_name"));
    	name.sendKeys("admin");
    	
        WebElement password=driver.findElement(By.name("user_password"));
        password.sendKeys("admin");
        
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    	
        Reporter.log("Entered un in Untxtfld",true);
 	    Reporter.log("Entered pswd in pswdtxtfld",true);
 	    Reporter.log("click on login btn",true);
	
    }
    
    
    @AfterMethod
    public void logout() {
    	Actions act = new Actions(driver);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]")));

        act.moveToElement(profile).perform();

        WebElement signOut = wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Sign Out")));
        signOut.click();
        Reporter.log("Creating org success", true); 
/*
        try {

            signOut.click();

        } catch (Exception e) {

            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].click();", signOut);

        }
        */
    	
    }
    
    @AfterClass
    public void BrowserTerminate() {
    	Reporter.log("Browser closed", true);
    	driver.close();
    }
    
}
