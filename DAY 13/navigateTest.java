package day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigateTest {
  @Test
  public void winow() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.makemytrip.com/");
	  System.out.println("navigated to webs1");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
	  driver.get("https://www.goindigo.in/flights");
	  System.out.println("navigated to webs2");
	  driver.manage().window().maximize();
	  
	  
	  driver.navigate().back();
	  System.out.println("navigated to webs1");
	  
	  driver.navigate().forward();
	  System.out.println("navigated to webs2");
	  
	  driver.navigate().refresh();
	  System.out.println("website 2 is refreshed");
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
  }
}
