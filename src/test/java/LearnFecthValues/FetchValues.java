package LearnFecthValues;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchValues {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement elementref=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		
		String actualtext=elementref.getText();
		System.out.println(actualtext);
		String exptext="Swag Labs";
		if(exptext.equals(actualtext)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String actualtagname=elementref.getTagName();
		System.out.println(actualtagname);
		String exptagname="div";
		if(exptagname.equals(actualtagname)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String actual_attvalue=elementref.getAttribute("class");
		System.out.println(actual_attvalue);
		String exp_attvalue="login_logo";
		if(exp_attvalue.equals(actual_attvalue)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		String actual_css=elementref.getCssValue("font-family");
		System.out.println(actual_css);
		String exp_css="\"DM Mono\", \"sans-serif\"";
		if(exp_css.equals(actual_css)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		org.openqa.selenium.Dimension actualsize=elementref.getSize();
		int actualwidth=actualsize.getWidth();
		int actualheight=actualsize.getHeight();
		System.out.println(actualsize);
		System.out.println(actualwidth);
		System.out.println(actualheight);
		int expwidth=1536;
		if(actualwidth == expwidth) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		int expheight=108;
		if(expheight==actualheight) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		org.openqa.selenium.Point actualallocation=elementref.getLocation();
		int actualx=actualallocation.getX();
		int actualy=actualallocation.getY();
		System.out.println(actualallocation);
		System.out.println(actualx);
		System.out.println(actualy);
		
		int expx=0;
		if(expx==actualx) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		int expy=0;
		if(expy==actualy) {
			System.out.println("true");
		}
		else { 
			System.out.println("false");
		}
		driver.close();
		
	}

}
