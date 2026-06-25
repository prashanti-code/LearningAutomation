package HandlingScreenshot;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webpagescreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		
		File permanentpath=new File("./src/test/resources/TestScreenshot/screenshot.png");
		
		try {
			FileHandler.copy(temppath, permanentpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("screenshot taken");
		driver.close();

	}

}
