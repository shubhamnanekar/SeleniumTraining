
package seleniumtraining;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String randomString = RandomString.make(3); // not making that much sense so not reccomendable
		String timestamp = new SimpleDateFormat("yyyymmddhhss").format(new Date()); // reccomendable
		// for number ?
		
		// RandomString.make(int length) - creates a random string of given length.
		// 'we have to concat this with file name'[because if we give a only name to this screenshot whatever times we have took 
	    // a screenshots name remains same it will just replace a screenshot so for this reason we have to 2 options random string
		// and timestamp by doing concat to the name it will creates screenshot with unique new names]
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// OutputType is an Interface
		// by default this will store in 'temporary memory' we store it in 'one reference variable' named as 'source'
		// 'getScreenshotAs() method returns file' so type of 'source' variable will be 'File'
		System.out.println(source);
		
		// but we want this screenshot at our desired location so we created one more object of file class
		// and we have to give a path in that File() within " " with file name(My First Screenshot) and its extension(.png)
		// 'very first give double quotes " " and then put path in that'
		// using random string
		File dest = new File("C:\\Users\\Shubham\\Desktop\\Selenium Screenshots\\My First Screenshot - "+randomString+".png");
		System.out.println(dest);
		// using timestamp
		// File dest = new File("C:\\Users\\Shubham\\Desktop\\Selenium Screenshots\\My First Screenshot - "+timestamp+".png");
		// System.out.println(dest);
		
		FileHandler.copy(source, dest);
		// now by using copy() method of FileHandler class, copy file from source to our desired location.
	}
}
