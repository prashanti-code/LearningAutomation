package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidationusingurl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		String expurl="https://www.selenium.dev/";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl)) {
			System.out.println("Url-verified:pass" +"   "+acturl);
		}else {
			System.out.println("Url-verified:fail"+" " +acturl);
		}
        driver.close();
	}

}
