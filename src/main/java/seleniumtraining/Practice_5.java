package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_5
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkbox1")).click();
		System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
		driver.findElement(By.id("checkbox2")).click();
		System.out.println(driver.findElement(By.id("checkbox2")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		

	}

}
