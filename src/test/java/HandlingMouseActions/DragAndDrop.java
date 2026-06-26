package HandlingMouseActions;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v146.target.model.DetachedFromTarget;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

import currenttimestamp.webelementscreenshot;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		WebElement dragele=driver.findElement(By.id("dragItem"));
		WebElement dropele=driver.findElement(By.id("dropZone"));
		WebElement doubleclick=driver.findElement(By.id("doubleBtn"));
		WebElement rightclick=driver.findElement(By.id("rightBtn"));
		WebElement hover=driver.findElement(By.id("tooltipTarget"));
		WebElement slider=driver.findElement(By.id("handle_max"));
		
		
		
		
		Actions act=new Actions(driver);
		//act.dragAndDrop(dragele,dropele).perform();
		act.doubleClick(doubleclick).perform();
		act.contextClick(rightclick).perform();
		act.clickAndHold(dragele).release(dropele).perform();
		act.moveToElement(hover).perform();
		act.dragAndDropBy(slider, 30, 0).perform();
		
		
		
		act.scrollByAmount(0, 500).perform();
		act.scrollToElement(slider).perform();
		act.scrollFromOrigin(ScrollOrigin.fromElement(hover), 0, 500).perform();

	}

}
