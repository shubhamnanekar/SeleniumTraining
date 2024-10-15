
package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListboxOrDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		WebElement DOBText = driver.findElement(By.xpath("//div[text()='Date of birth']"));
		System.out.println(DOBText.getText());
		
		System.out.println("==========================================================================");
		
		WebElement day = driver.findElement(By.cssSelector("select[id=day]"));
		Select s = new Select(day);
		System.out.println("whether this dropdown is multiselectable or not - "+s.isMultiple());
		// isMultiple() method used to verify whether that webelement or dropdown is multiselectable or not
		// it return 'boolean output' if yes then true otherwise return false
		
		System.out.println("===========================================================================");
		
		List<WebElement> allOptions = s.getOptions();
		// getOptions() method return all the options belonging to this 'select' tag
		// getOptions() returns multiple options so 'return type' is 'List<WebElement>' 
		// to see what are those options we have to traverse through list of webelement
		// and to traverse in list we have four options for, for-each, Iterator and ListIterator.
		
		System.out.println("Day WebElement contains following options in dropdown/Listbox: ");
		int count = 0;
		for(int i = 0; i < allOptions.size(); i++)
		{
			System.out.println(allOptions.get(i).getText());
			count++;
		}
		
		System.out.println("===========================================================================");
		
		System.out.println("Total count of days in Day webelement Dropdown/Listbox is "+count);
		Thread.sleep(2000);
		s.selectByIndex(13);
		Thread.sleep(2000);
		s.selectByValue("16");
		Thread.sleep(500);
		s.selectByVisibleText("17");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		// getAllSelectedOptions() method returns 'All selected options' belonging to this 'select tag'
		// getAllSelectedOptions() returns multiple options so 'return type' is 'List<WebElement>' 
		// to see what are those options we have to traverse through list of webelement
		// and to traverse in list we have four options for, for-each, Iterator and ListIterator.
		System.out.println("==== all selected options and their Count ==================================================");
		int count1 = 0;
		for(WebElement aso : allSelectedOptions)
		// 'aso' is 'reference variable' of 'type webelement', webelement type comes here because these 'list is of webelement type' 
		{
			System.out.println(aso.getText());
			count1++;
		}
		System.out.println("Count of all the selected options is "+count1);
		System.out.println("=============================================================================");
		
		System.out.println("First selected option is "+s.getFirstSelectedOption().getText());
	
	}
}
