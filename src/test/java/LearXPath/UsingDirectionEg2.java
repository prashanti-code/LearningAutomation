package LearXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingDirectionEg2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement utf=driver.findElement(By.id("user-name"));
		utf.sendKeys("standard_user");
		WebElement ptf=driver.findElement(By.id("password"));
		ptf.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(1000);
		WebElement productclick=driver.findElement(By.id("item_4_title_link"));
		productclick.click();
		Thread.sleep(1000);
		WebElement productname=driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']/../div[1]"));
		String name=productname.getText();
		System.out.println(name);

		
		//input[@class='submit-button btn_action']/../div/input[@placeholder='Username']
		//input[@placeholder='Username']/..//input[@placeholder='Password']
		//input[@placeholder='Password']/..//input[@class='submit-button btn_action'][1]
		
	}

}
