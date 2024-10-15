
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGKeywords 
{
	@Test(invocationCount = 2)
	public void a() 
	{
		Reporter.log("a method", true); 
	}

	@Test(priority = -1)
	public void d()
	{
		Reporter.log("d method", true);
	}

	@Test(priority = -1)
	public void c()
	{
		Reporter.log("c method", true);
	}
	
	@Test(enabled = false)
	public void b()
	{
		Reporter.log("b method", true);
	}
	
	@Test(timeOut = 1000)
	// timeOut keyword - The maximum number of milliseconds this test should take. 
	// If it hasn't returned after this time, it will be marked as a FAIL.
	// using this keyword "we restricts the user to perform operation within provided time and also we can provide restrictions."
	public void e() throws InterruptedException
	{
		Thread.sleep(500);
		Reporter.log("e method", true);
	}
	
	@Test(dependsOnMethods = {"d","c"})
	public void f()
	{
		Reporter.log("f method", true);
	}
}
