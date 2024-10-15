
package seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopup 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		String mainWindowId = driver.getWindowHandle();
		System.out.println("Main page or window ID : "+mainWindowId);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		// if we wants window id's in maintained order then we have to convert set into list
		List<String> list = new ArrayList<String>(allWindowIds);
		System.out.println(list);
		
		// by using next() method of Iterator and get(index) method of list we can fetch Id's of the windows which are 
		// currently opened in the session.
		Iterator<String> it = list.iterator();
		String mainPageId = it.next(); // 'it' points somewhere outside firstly then by doing it.next() it is pointing to 0th index & so on.
		System.out.println("Main page ID : "+mainPageId);
		String childBrowserId = it.next();
		System.out.println("Child browser ID : "+childBrowserId);
		
		String childWindowId = list.get(1);
		System.out.println("Child browser or window ID : "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#the7-search")).sendKeys("testing",Keys.ENTER);
		
		driver.switchTo().window(mainWindowId);
		
		
	}
}
