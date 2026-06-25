package LearnBasics;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchBrowser_userchoice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String browsername=sc.next();
		if(browsername.equalsIgnoreCase("chrome")) {
			new ChromeDriver();
		} else {
			new EdgeDriver();
		}
	}
	}




	