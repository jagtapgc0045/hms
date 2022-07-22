package Loop;

import Access_specifier.sample6;

public class demo2 extends sample6
{
   // use of protected access specifier ----from different package by using inheritance operation
	
	public static void main(String[] args) 
	{
		//create object
		demo2 D1=new demo2();
		D1.m25();
		System.out.println(D1.a);
		
	}
	
}
