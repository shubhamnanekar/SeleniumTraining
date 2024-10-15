

package serialparellelExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3 
{
	@Test
	public void f() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
	}
}
