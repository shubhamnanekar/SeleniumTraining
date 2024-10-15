
package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@title='Get Started']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()=' Next ']")).click();
		Thread.sleep(2000);

		WebElement dropDown = driver.findElement(By.cssSelector("select#Age-You"));
		Select select = new Select(dropDown);
		select.selectByVisibleText(" 25 years ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("411014");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("7744012233");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		Thread.sleep(4000);

		String result = driver.findElement(By.xpath("//div[contains(text(),'matching Health Insurance Plans')]")).getText();
		System.out.println(result);
		String result1 = result.substring(0, 2);
		System.out.println("number from string using substring is "+result1);

		// String to Integer conversion
		int data = Integer.parseInt(result1);
		System.out.println("matching result count : "+data);

		int totalNumberOfFrames = driver.findElements(By.xpath("//div[@class='plan-card-container']")).size();
		System.out.println("total frames count : "+totalNumberOfFrames);

		if(data == totalNumberOfFrames)
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
	}
}
