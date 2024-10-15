
package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void ztest1() 
	{
		Reporter.log("z test1", true);
	}
	
	@Test
	public void atest2()
	{
		Reporter.log("a test2", true);
	}
	
	@BeforeMethod
	public void cbeforeMethod()
	{
		Reporter.log("c Before method", true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before method", true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before class", true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("after class", true);
	}
}
