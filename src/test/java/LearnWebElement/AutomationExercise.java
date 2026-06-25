package LearnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationExercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		WebElement loginlink=driver.findElement(By.linkText("Signup / Login"));
		loginlink.click();
		WebElement username=driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]/preceding-sibling::input[@placeholder='Name']"));
		username.sendKeys("prashanti");
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Name']/following::input[@placeholder='Email Address']"));
		email.sendKeys("prashanti9114@gmail.com");
		WebElement signupbtn=driver.findElement(By.xpath("(//button[@class=\"btn btn-default\"])[2]"));
		signupbtn.click();
		WebElement acc=driver.findElement(By.xpath("(//button[@class=\"btn btn-default\"])[2]"));
		acc.click();
		Thread.sleep(3000);
		WebElement radiobtn=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radiobtn.click();
		
		
		boolean displaystatus=radiobtn.isDisplayed();
		if(displaystatus) {
			System.out.println("element displayed status:" +displaystatus);
		} else {
			System.out.println("element displayed status:" +displaystatus);
		}
		
		boolean enabledstatus=radiobtn.isEnabled();
		if(enabledstatus) {
			System.out.println("element enabled status:" +enabledstatus);
		} else {
			System.out.println("element enabled status:" +enabledstatus);
		}
		
		boolean selectedstatus=radiobtn.isSelected();
		if(selectedstatus) {
			System.out.println("element selected status:" +selectedstatus);
		} else {
			System.out.println("element selected status:" +selectedstatus);
		}
		
		
		
		
		

	}

}
