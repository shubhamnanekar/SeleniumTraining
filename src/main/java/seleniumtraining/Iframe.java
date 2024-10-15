
package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		int totalNoOfIframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of frames present on webpage are "+totalNoOfIframes);
		
		driver.switchTo().frame("frame1");
		String parentFrameText = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("Text present on Parent frame is "+parentFrameText);
		
		// using webelement, we can't store webelement in ref variable and then pass that variable 
		// element element not able to find that why directly write in frame()
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		String childFrameText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println("Text present on Child frame is "+childFrameText);
		
		driver.switchTo().defaultContent();
		String mainPageText = driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();
		System.out.println("Text present on Main page is "+mainPageText);
		
	}
}
