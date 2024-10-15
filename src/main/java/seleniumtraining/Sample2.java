
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.sendKeys("studentt");
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("Password123");
		WebElement submit = driver.findElement(By.cssSelector("button#submit"));
		submit.click();
	//	WebElement logout = driver.findElement(By.xpath("//a[contains(@class,'wp-block-button__link has-text-color')]"));
    //	logout.click();
		WebElement errorMsg = driver.findElement(By.cssSelector("div#error"));
		System.out.println(errorMsg.getText());
		
	}
}
