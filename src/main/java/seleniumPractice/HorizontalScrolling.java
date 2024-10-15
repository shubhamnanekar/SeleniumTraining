
package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorizontalScrolling 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://getdataden.com/docs/grid/layout/custom-css/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)");
		
		ChromeOptions c = new ChromeOptions();
		Actions a = new Actions(driver);
		
	}
}
