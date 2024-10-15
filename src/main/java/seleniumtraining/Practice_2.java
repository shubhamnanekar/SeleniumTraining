
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_2 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://formstone.it/components/dropdown/demo");
		driver.manage().window().maximize();
		
		/*WebElement dropdown = driver.findElement(By.xpath("//select[@name='demo_basic']"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		select.selectByIndex(0);*/
		
		//For Single Dropdown
		/*driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select select = new Select(dropdown);
		
		select.selectByValue("AFG");
		select.selectByVisibleText("Åland Islands");
		select.selectByIndex(2);
		
		WebElement option = select.getFirstSelectedOption();
		System.out.println(option.getText());
		System.out.println(option.getSize());*/
		
		//For Multi Select Dropdown
		driver.get("https://admirhodzic.github.io/multiselect-dropdown/demo.html");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("field1"));
		Select select1 = new Select(dropdown);
		select1.selectByIndex(0);
		
		

	}
}
