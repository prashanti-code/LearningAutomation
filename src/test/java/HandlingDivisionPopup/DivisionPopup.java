package HandlingDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DivisionPopup {
	public static void main(String[] args) {
		ChromeOptions co_obj = new ChromeOptions();
		co_obj.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co_obj);
		driver.get("https://www.goibibo.com");
		//Identify Hidden content close option
		WebElement closeicon = driver.findElement(By.xpath("//span[@role='presentation']"));
		closeicon.click();
	}

}
