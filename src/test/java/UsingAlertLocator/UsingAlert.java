package UsingAlertLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import currenttimestamp.webelementscreenshot;

public class UsingAlert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement popupbtn=driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		popupbtn.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("prash");
		driver.switchTo().alert().accept();
		
		
		WebElement popbtn=driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		popbtn.click();
		driver.switchTo().alert().accept();
		
		WebElement poppbtn=driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		poppbtn.click();
		driver.switchTo().alert().dismiss();

	}
	
}
