package HandlingSynchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitsynch {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50l));
		driver.get("https://www.shoppersstack.com/");
		WebElement loginbtn=driver.findElement(By.cssSelector("#loginBtn"));
		WebElement text=driver.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));
		String actualtext=text.getText();
		System.out.println(actualtext);
		loginbtn.click();
		driver.close();
	}
}
