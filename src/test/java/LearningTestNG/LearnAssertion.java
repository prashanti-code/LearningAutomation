package LearningTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import currenttimestamp.webelementscreenshot;

public class LearnAssertion {
	 @Test
     public void Task1() {

		 String exptitle= "selenium";
    	 String acttitle= "selenium";
    	 
    	 int expwidth=0;
    	 int actwidth=0;
    	 
    	 boolean expdisplaysts=true;
    	 boolean actdisplaysts=true;
    	 
    	 
    	 /* if(exptitle.equals(acttitle)) {
    	  System.out.println("title verified:pass");
    	  } else {
    		  System.out.println("title verified:fail");
    	  } */
    	 
    	 //hard assertion
    	 Assert.assertEquals(exptitle, acttitle);
    	 Assert.assertEquals(actwidth,expwidth);
    	 Assert.assertEquals(expdisplaysts, actdisplaysts);    	 
     }
	 
	 
	 @Test
	 public void Task2() {
		 WebDriver driver=new ChromeDriver();
          driver.get("https://www.saucedemo.com/");
          
         String exptitle= "Swag Labs";
     	 String acttitle=driver.getTitle();
     	 Assert.assertEquals(acttitle,exptitle);
     	 
     	 WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Username']"));
     	 boolean displaysts=ele.isDisplayed();
     	 Assert.assertEquals(displaysts, true);
     	 Assert.assertTrue(displaysts);
     	 
     	 
     	 
     	 int expwidth=292;
     	 int actwidth=ele.getSize().getWidth();
     	 Assert.assertEquals(actwidth,expwidth);
     	 
	 }
	 
	 @Test
	 public void Task3() {
		 SoftAssert saobj = new SoftAssert();
		 
		 WebDriver driver=new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         
         String exptitle= "Swag Labs";
    	 String acttitle=driver.getTitle();
    	 saobj.assertEquals(acttitle,exptitle);
    	 
    	 WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Username']"));
    	 boolean displaysts=ele.isDisplayed();
    	 saobj.assertEquals(displaysts, true);
    	 saobj.assertTrue(displaysts);
    	
    	 int expwidth=292;
    	 int actwidth=ele.getSize().getWidth();
    	 saobj.assertEquals(actwidth,expwidth);
    	 
    	 saobj.assertAll();
    	 driver.close();
	 }
}
