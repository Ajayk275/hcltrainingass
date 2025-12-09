package day12;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class searchproduct {
  @Test
  public void test() throws InterruptedException {
	  
	  Scanner sc=new Scanner(System.in);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement searchBar=driver.findElement(By.name("q"));
		System.out.println("Enter the product name:");
		String name=sc.nextLine();
		System.out.println("Enter the product preference number:");
		int num=sc.nextInt();
		
		searchBar.sendKeys(name);
		
		searchBar.sendKeys(Keys.ENTER);
		
		WebElement productnum=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div["+num+"]/div/div/div/a/div[2]/div[1]/div[2]"));
		productnum.click();
		


	}

}
 
