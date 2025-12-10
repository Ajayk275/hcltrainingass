package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class muliteselect {
  @Test
  public void multi() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select");
	  driver.manage().window().maximize();
	  
	  WebElement s1=driver.findElement(By.xpath("//*[@id=\"multiple-select-context\"]/label/span[2]/span[1]/span"));
	  s1.click();
	  
	  WebElement books=driver.findElement(By.xpath("//div[@style='margin-top: -1360px; transform: translate3d(0px, 0px, 0px);']/div[41]"));
	  books.click();
	  
	  WebElement movie=driver.findElement(By.xpath("//div[@style='margin-top: -1360px; transform: translate3d(0px, 0px, 0px);']/div[42]"));
	  movie.click();
	  
	  WebElement ele=driver.findElement(By.xpath("//div[@style='margin-top: -1360px; transform: translate3d(0px, 0px, 0px);']/div[43]"));
	  ele.click();
	  
	  WebElement home=driver.findElement(By.xpath("//div[@style='margin-top: -1360px; transform: translate3d(0px, 0px, 0px);']/div[44]"));
	  home.click();
	  
	  WebElement health=driver.findElement(By.xpath("//div[@style='margin-top: -1360px; transform: translate3d(0px, 0px, 0px);']/div[45]"));
	  health.click();
	  
	  driver.quit();
	  
	 
	  
	  
  }
}
