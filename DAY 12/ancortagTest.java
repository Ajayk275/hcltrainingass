package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ancortagTest {
  @Test
  public void anchor() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  
	  List<WebElement> anc=driver.findElements(By.tagName("a"));
	  System.out.println("The total number of a tag is : "+anc.size());
	  int count = 1;
	  for(WebElement anchortags:anc) {
		  String href = anchortags.getAttribute("href");
		  System.out.println(count+ ":"+href);
		  count++;
	  }
	  
	  driver.quit();
	  
	  
  }
}
