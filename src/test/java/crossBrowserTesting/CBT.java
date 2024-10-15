
package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CBT 
{
	@Test@Parameters({"browsername","fname","lname","mobno"})
	
	public void cbt(String browserName, String firstname, String lastname, String mobileno) 
	{
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileno);
		}

		else if(browserName.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();;
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileno);
		}
	}
}
