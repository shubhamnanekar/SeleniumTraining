
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExcludeTag
{
	@Test
	public void e()
	{
		Reporter.log("e's method", true);
	}
	
	@Test
	public void f()
	{
		Reporter.log("f's method", true);
	}
	
	@Test
	public void g()
	{
		Reporter.log("g's method", true);
	}
	
	@Test
	public void h()
	{
		Reporter.log("h's method", true);
	}
}
