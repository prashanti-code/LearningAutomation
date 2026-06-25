package LearnWebDriver;

import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.kfc.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to(new URL("https://www.google.com"));
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();//close single window
		driver.quit();//close multiple window
	}

}
