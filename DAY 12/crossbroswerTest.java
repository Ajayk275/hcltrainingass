package day12;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class crossbroswerTest {
  @Test
  public void broswer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the browser you want to launch");
		String Browser = scan.nextLine();
		
		WebDriver driver = null; 
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			 driver = new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("FireFox")) {
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//img[@class='banner-image']")).click();
		
		
		

	}

}

