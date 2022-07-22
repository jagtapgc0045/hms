package Type_of_variables;

public class static_global

{
    static int a=50;     //static global variable
	
	public static void main(String[] args)
	{
		System.out.println(a);       //variable name
		
		m1();                        //methodname();
		
		static_global A1=new static_global();
		A1.m2();

	}
	
	public static void m1()
	{
		System.out.println(a);       //variablename
	}
	
	public void m2()
	{
		System.out.println(a);       //variablename
	}
	
	
	
	
	
	
	
	
	
	
	
}
