package iputmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/ ");
		driver.manage().window().maximize();
		
		
		WebElement Raiobutton =driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
		Raiobutton.click();
		System.out.println("Radiobutton is Selected:"+Raiobutton.isSelected());
		
		WebElement CheckBox1 =driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		CheckBox1.click();
		System.out.println("CheckBox1 is Selected:"+CheckBox1.isSelected());
		
		WebElement CheckBox2 =driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
		CheckBox2.click();
		System.out.println("CheckBox2 is Selected:"+CheckBox2.isSelected());
		
		WebElement CheckBox3 =driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]"));
		CheckBox3.click();
		System.out.println("CheckBox3 is Selected:"+CheckBox3.isSelected());
		
		driver.quit();
		

	}

}