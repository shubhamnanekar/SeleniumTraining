package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.id("testingDropdown"));
		Select select = new Select(dropdown);
	 	//select.selectByValue("Manual");
		select.selectByIndex(2);
		//select.selectByVisibleText("Two");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		select.selectByIndex(0);
		//select.selectByValue("Automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//select.selectByValue("Database");
		select.selectByIndex(3);*/
		
		// For Multiple select dropdown
		
		driver.get("https://admirhodzic.github.io/multiselect-dropdown/demo.html");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div/div/div[1]"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
	}
}
