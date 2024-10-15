
package testNGPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	@Test
	public void method1()
	{
		//	  WebDriverManager.chromedriver().setup();
		//	  ChromeDriver driver = new ChromeDriver();
		//	  driver.get("https://www.google.com/");
		//	  driver.manage().window().maximize();

		System.out.println("Hello, it will print on console.");
		Reporter.log("Hello, it will print on HTML Reports");
		Reporter.log("Hello", false);
		// if we provide boolean input as 'false' it will print only on HTML Reports.
		// working same like single parameter log method.
		Reporter.log("Hello", true);
		// if we provide boolean input as 'true' it will print only on HTML Reports as well as on console.
	}
}
