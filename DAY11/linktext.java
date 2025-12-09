package iputmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://money.rediff.com/news/share-market-news");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Mutual Funds")).click();
		
		

	}

}
