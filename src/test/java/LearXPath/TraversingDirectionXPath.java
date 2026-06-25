package LearXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingDirectionXPath {

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
		WebElement productprice=driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']/..//div[@class='inventory_details_price']"));
		String price=productprice.getText();
		System.out.println(price);
		WebElement productdes=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']/../div[@class='inventory_details_desc large_size']"));
		String des=productdes.getText();
		System.out.println(des);
		WebElement addtocartbtn=driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']/..//button[@class='btn btn_primary btn_small btn_inventory']"));
		String btn=addtocartbtn.getText();
		addtocartbtn.click();
		System.out.println(btn);
		
		
		//div[@class="inventory_details_name large_size"]/../div[1]
		//div[@class='inventory_details_name large_size']/..//div[@class='inventory_details_price']
		//div[@class='inventory_details_desc large_size']/..//button[@class='btn btn_primary btn_small btn_inventory']
		//button[@class='btn btn_primary btn_small btn_inventory']/../div[@class="inventory_details_desc large_size"]
	}

}
