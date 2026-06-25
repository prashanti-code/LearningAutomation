package OrderProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderProduct {

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
		WebElement addtocart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		Thread.sleep(1000);
		WebElement clickcart=driver.findElement(By.className("shopping_cart_link"));
		clickcart.click();
		Thread.sleep(1000);
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(1000);
		WebElement firstname=driver.findElement(By.id("first-name"));
		firstname.sendKeys("prashanti");
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.sendKeys("S");
		WebElement postal=driver.findElement(By.id("postal-code"));
		postal.sendKeys("636016");
		Thread.sleep(1000);
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		Thread.sleep(1000);
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(1000);
		WebElement backtohome=driver.findElement(By.id("back-to-products"));
		backtohome.click();
		Thread.sleep(1000);
		WebElement btn=driver.findElement(By.id("react-burger-menu-btn"));
		btn.click(); 
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
		
	}

}
