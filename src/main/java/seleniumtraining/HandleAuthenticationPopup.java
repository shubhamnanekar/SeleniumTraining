
package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationPopup 
{
	public static String username = "admin";
	public static String password = "admin";
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	}
}
