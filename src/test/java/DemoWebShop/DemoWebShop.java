package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement registerlink=driver.findElement(By.xpath("//a[@class='ico-register']"));
		registerlink.click();
		WebElement gender=driver.findElement(By.xpath("(//div[@class='gender'])[2]/child::label[@class='forcheckbox']"));
		gender.click();
		WebElement fstname=driver.findElement(By.xpath("//form/div/div/div/div/div[2]/input[@class='text-box single-line']"));
		fstname.sendKeys("Prashanti");
		WebElement lstname=driver.findElement(By.xpath("//input[@class='text-box single-line']/..//input[@id='LastName']"));
		lstname.sendKeys("S");
		WebElement email=driver.findElement(By.xpath("//input[@id='LastName']/following::input[@class='text-box single-line']"));
		email.sendKeys("prashanti123@gmail.com");
		WebElement pswd=driver.findElement(By.xpath("(//span[@class='required'])[4]/preceding-sibling::input[@class='text-box single-line password']"));
		pswd.sendKeys("prashanti123");
		WebElement cpswd=driver.findElement(By.xpath("//input[@data-val-length-max='999']/../..//input[@name='ConfirmPassword']"));
		cpswd.sendKeys("prashanti123");
		WebElement register=driver.findElement(By.xpath("//input[@type='submit' and @id='register-button']"));
		register.click();
		

	}

}
