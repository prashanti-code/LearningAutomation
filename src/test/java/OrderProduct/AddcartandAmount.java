package OrderProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddcartandAmount {

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
		WebElement productname=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		String name=productname.getText();
		System.out.println("Name:" + name);
		WebElement productprice=driver.findElement(By.className("inventory_item_price"));
		String price=productprice.getText();
		System.out.println("Price:" +price);

	}

}
