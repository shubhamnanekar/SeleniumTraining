
package seleniumtraining;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshotDemo 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Date currdate = new Date();
		System.out.println(currdate);
		String screenshotfilename = currdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// cast driver with TakesScreenshot
		FileUtils.copyFile(screenshotfile, new File(".//screenshot//"+screenshotfilename+".png"));
	}
}
