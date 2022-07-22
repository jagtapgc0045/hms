package Loop;

import Access_specifier.sample1;

public class demo1 
{
  // use of public access specifier in different package
	
	public static void main(String[] args) 
	{
		
		// create object of different class
		sample1 S1=new sample1();
		//call the method
		S1.m1();
		S1.m2();
		System.out.println(S1.a);
	}
	
	
	
	
}
