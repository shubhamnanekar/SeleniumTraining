
//How to handle auto suggestions using xpath including by index .get(index) method
package seleniumtraining;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Timeout // Implicit wait

		driver.get("https://www.google.com"); // open website

		driver.findElement(By.name("q")).sendKeys("shivaji maharaj");
		
		Thread.sleep(3000); // 3 sec
		
		By searchBox = By.xpath("//ul//li[@class='sbct']");
		
		List<WebElement> element = driver.findElements(searchBox);
		
		System.out.println("Size: "+element.size());
		
		element.get(4).click();

		driver.quit();
	}
}