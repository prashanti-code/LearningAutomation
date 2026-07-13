package FileUploadPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Steps to handle fileupload popup
		//1.Identify the chooseFile button
		WebElement choosefile=driver.findElement(By.id("file-upload"));
		
		//2.Create the file using file class
		File actualfile=new File("./src/test/resources/data/Notes.txt");
		
		//3.Pass the absolute path,inside sendkeys
		choosefile.sendKeys(actualfile.getAbsolutePath());
		
	}
}
