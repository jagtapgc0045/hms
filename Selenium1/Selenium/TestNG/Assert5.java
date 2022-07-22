package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert5 
{
	@Test
	public void assertnull()
	{
		String str=null;
		
		Assert.assertNull(str);
	}
    
	@Test
	public void assertnull1()
	{
		String str="abcd";
		
		Assert.assertNull(str);
	}
}
