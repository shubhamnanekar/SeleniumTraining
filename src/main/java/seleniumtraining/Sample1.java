
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@id='rt']")).click();
		String s1 = driver.findElement(By.xpath("//label[@id='rt']")).getText();
		System.out.println(s1);
	}
}
