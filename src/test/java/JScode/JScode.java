package JScode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor jseobj=(JavascriptExecutor)driver;
		
		jseobj.executeScript("window.location=arguments[0]", "https://automationexercise.com/");
		
		jseobj.executeScript("history.go(0)");
		
		System.out.println(jseobj.executeScript("return document.title"));
		
		System.out.println(jseobj.executeScript("return document.URL"));
		
		jseobj.executeScript("arguments[0].click()", driver.findElement(By.partialLinkText("Log")));
		
		jseobj.executeScript("arguments[0].value='prash'", driver.findElement(By.name("name")));
		jseobj.executeScript("arguments[0].value='prash123@gmail.com'", driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
		
		jseobj.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[text()='Signup']")));
		
		jseobj.executeScript("arguments[0].value='prash@gmail.com'", driver.findElement(By.id("email")));
		
		jseobj.executeScript("window.scrollIntoView(true)",driver.findElement(By.xpath("//h2/b[test()='Address Information']")));
		jseobj.executeScript("window.scrollBy(0,300)");
		jseobj.executeScript("window.scrollTo(0,300)");
		System.out.println("execution done");
		

	}

}
