
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3
{
	@Test
	public void i()
	{
		Reporter.log("i's method", true);
	}

	@Test(groups = {"Regression"})
	public void j()
	{
		Reporter.log("j's method", true);
	}

	@Test(groups = {"Sanity"})
	public void k()
	{
		Reporter.log("k's method", true);
	}

	@Test
	public void l()
	{
		Reporter.log("l's method", true);
	}
}
