
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords 
{
	@Test
	public void x() 
	{
		Reporter.log("x method", true);
	}
	
	@Test
	public void b() 
	{
		Reporter.log("b method", true);
	}
	
	@Test
	public void a() 
	{
		Reporter.log("a method", true);
	}
	
	@Test(dependsOnMethods = {"x","z"})//, timeOut = 1000, dependsOnMethods = {"b"})
	public void multipleKeywords()
	{
		Reporter.log("multiple Keywords", true);
	}
	
	@Test
	public void y() 
	{
		Reporter.log("y method", true);
	}
	
	@Test
	public void z() 
	{
		Reporter.log("z method", true);
	}
	
	@Test
	public void c() 
	{
		Reporter.log("c method", true);
	}
	
	@Test
	public void d() 
	{
		Reporter.log("d method", true);
	}
}
