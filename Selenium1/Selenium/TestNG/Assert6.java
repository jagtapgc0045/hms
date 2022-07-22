package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert6 
{

	@Test
	public void assertnotnull()
	{
		String str="abcd";
		
		Assert.assertNotNull(str);
	
	}
	@Test
	public void assertnotnull1()
	{
		String str=null;
		
		Assert.assertNotNull(str);
	}
		

}
