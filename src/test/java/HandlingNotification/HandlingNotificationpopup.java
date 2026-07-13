package HandlingNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationpopup {

	public static void main(String[] args) {
		ChromeOptions co_obj=new ChromeOptions();
		co_obj.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(co_obj);
		driver.get("https://www.goibibo.com/");

	}

}
