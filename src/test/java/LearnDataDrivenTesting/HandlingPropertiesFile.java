package LearnDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import currenttimestamp.webelementscreenshot;

public class HandlingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Fetch data from properties file
		
		//1.
		FileInputStream fis=new FileInputStream("./src/test/resources/commondataSD.properties");
		
		//2.
		Properties prop_obj=new Properties();
		
		//3.
		prop_obj.load(fis);
		
		//4.
		String data= prop_obj.getProperty("url");
		String username=prop_obj.getProperty("username");
		String password=prop_obj.getProperty("password");
		String login=prop_obj.getProperty("login");
		
		//steps to write data
		//5.
		prop_obj.put("browser", "chrome");
		
		//6.
		FileOutputStream fos=new FileOutputStream("./src/test/resources/commondataSD.properties");
		
		//7.
		prop_obj.store(fos, "browser key added");

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		//utilize the data
		driver.get(data);
		WebElement un=driver.findElement(By.id("user-name"));
		un.sendKeys(username);
		WebElement pwsd=driver.findElement(By.id("password"));
		pwsd.sendKeys(password);
		WebElement lgn=driver.findElement(By.id("login-button"));
		lgn.click();

	}

}
