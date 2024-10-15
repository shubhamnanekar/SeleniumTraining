package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsersOpenUsingTestNG 
{
	@Test
	public void chrome() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

//	@Test
//	public void chrome1()
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/login.php/");
//		driver.manage().window().maximize();
//	}

	@Test
	public void firefox()
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
}
