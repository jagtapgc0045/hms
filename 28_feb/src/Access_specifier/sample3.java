package Access_specifier;

public class sample3
{
    //private -----access specifier
    //method call from that class only...not to any other class
	
	private int a=15;
	
	public static void main(String[] args) 
	{
		//create object
		sample3 P1=new sample3();
		P1.m1();
		System.out.println(P1.a);
		
	}
	private void m1()
	{
		System.out.println("HII....MAHESH");
	}
	
	
}
