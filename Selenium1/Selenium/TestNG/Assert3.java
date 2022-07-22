package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assert3 
{
	@Test
	public void assertTrue()
	{
		boolean ActualResult=true;
		
		Assert.assertTrue(ActualResult);
	}
	@Test
	public void assertTrue1()
	{
		boolean ActualResult=false;
		
		Assert.assertTrue(ActualResult);
	}
	

}
