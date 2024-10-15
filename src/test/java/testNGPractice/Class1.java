
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 
{
	@Test
	public void a() 
	{
		Reporter.log("a's method", true);
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void b()
	{
		Reporter.log("b's method", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("c's method", true);
	}
	
	@Test(groups = {"Sanity"})
	public void d()
	{
		Reporter.log("d's method", true);
	}
}
