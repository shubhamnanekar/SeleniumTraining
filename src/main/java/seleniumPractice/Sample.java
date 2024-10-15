
package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		boolean b1= driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		System.out.println(b1);
		boolean b2= driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(b2);
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		boolean b3= driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(b3);
		boolean b4= driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		System.out.println(b4);
		
		//driver.close();
		
		String s1 = driver.findElement(By.xpath("//div[@class='_52lr _9bq0 fsm fwn fcg']")).getText();
		System.out.println(s1);

		
		
	}
}
