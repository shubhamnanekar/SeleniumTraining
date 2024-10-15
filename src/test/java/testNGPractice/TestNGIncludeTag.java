
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGIncludeTag
{
	@Test
	public void a() 
	{
		Reporter.log("a's methods", true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("b's methods", true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("c's methods", true);
	}
	
	@Test
	public void d()
	{
		Reporter.log("d's methods", true);
	}
}
