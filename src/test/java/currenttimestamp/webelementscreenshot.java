package currenttimestamp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementscreenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50l));
		driver.get("https://www.shoppersstack.com/");
		WebElement text=driver.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));
		File tempPath = text.getScreenshotAs(OutputType.FILE);
        SimpleDateFormat sdf = new SimpleDateFormat("2026-03-01-05-10-40");
        String customTime = sdf.format(new Date());
        File permanentPath = new File("./src/test/resources/TestScreenshots/Screenshot_"
                        + customTime + ".png");

        try {
            org.openqa.selenium.io.FileHandler.copy(tempPath, permanentPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Screenshot Taken");

        driver.quit();
    }
}