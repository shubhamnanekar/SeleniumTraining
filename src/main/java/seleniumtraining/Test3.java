package seleniumtraining;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 
{

	public static void main(String[] args) 
	{
	    WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("7744012232");
		//driver.findElement(By.id("pass")).sendKeys("14121998");
		//driver.findElement(By.name("login")).click();
		
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.findElement(By.name("q")).sendKeys("Shivaji maharaj");
	    By searchBox = By.xpath("//div[@class=\"mkHrUc\"]//ul[@class=\"G43f7e\"]//li[@class=\"sbct\"]");
	    List<WebElement> element = driver.findElements(searchBox);
	    element.get(2).click();
	    
	    //driver.findElement(By.xpath("(//div[@class=\"mkHrUc\"]//ul[@class=\"G43f7e\"]//li[3])")).click();
	    
		//driver.findElement(By.name("q")).sendKeys("God",Keys.ENTER);
		//driver.findElement(By.partialLinkText("Wikipedia")).sendKeys(Keys.ENTER);
		
	    
		
		//driver.close();
	}

}
