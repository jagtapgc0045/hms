package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assert4 
{
	@Test
	public void assertFalse()
	{
		boolean ActualResult=false;
		
		Assert.assertFalse(ActualResult);
	}
	@Test
	public void assertFalse1()
	{
		boolean ActualResult=true;
		
		Assert.assertFalse(ActualResult);
	}

}
