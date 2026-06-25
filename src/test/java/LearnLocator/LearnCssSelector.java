package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.WebElementToJsonConverter;

public class LearnCssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement untxtfld=driver.findElement(By.cssSelector("input[id]"));
		untxtfld.sendKeys("standard_user");
		

	}

}
