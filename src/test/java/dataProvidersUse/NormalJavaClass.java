
package dataProvidersUse;

import org.testng.annotations.DataProvider;

public class NormalJavaClass
{
	@DataProvider(name="Male data")
	public String[][] data1()
	{
		String data[][] = {{"Shubham","Nanekar","7744012211"}, {"Shivam","Patil","7754312345"}};
		return data;
	}
	
	@DataProvider(name="Female data")
	public String[][] data2()
	{
		String data[][] = {{"Aishwarya","Nanekar","7744012211"}, {"Janhavi","Patil","7754312345"}};
		return data;
	}

}
