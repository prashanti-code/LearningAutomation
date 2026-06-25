package LearnWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchWindowAddress {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String parentadd=driver.getWindowHandle();
		System.out.println( parentadd);
		driver.navigate().refresh();
		System.out.println(driver.getWindowHandle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.gmail.com");
		Set<String> childadd=driver.getWindowHandles();
		System.out.println(childadd);
		driver.quit();

	}

}
