
package dataProvidersUse;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginTestNGClass 
{
	//@Test(dataProviderClass = dataProvidersUse.NormalJavaClass.class, dataProvider = "Female data")
	@Test(dataProvider = "Input Data")
	public void fbLogin(String firstname, String lastname, String mobileno) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileno);
	}
	
	@DataProvider(name="Input Data")
	public String[][] inputData()
	{
		String inputdata[][] = {{"a","b","12345"}, {"x","y","56789"}};
		return inputdata;
	}
}
