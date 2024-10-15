
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_1 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		/*driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).clear();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='Male']")).getAttribute("value"));
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='Cricket']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@value='Cricket']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected());
		
		System.out.println(driver.findElement(By.xpath("//input[@type='file']")).getTagName());
		System.out.println(driver.findElement(By.xpath("//input[@type='file']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@type='file']")).getSize());
		System.out.println(driver.findElement(By.xpath("//input[@type='file']")).getLocation());*/
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[@class='login_logo']")).getText());
		System.out.println(driver.findElement(By.xpath("//input[@value='Login']")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("font-family"));		
		
	}
}
