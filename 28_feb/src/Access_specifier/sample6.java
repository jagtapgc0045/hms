package Access_specifier;

public class sample6 
{
	//protected---access specifier----
	
  protected int a=57;

public static void main(String[] args)
{
	// create object
	sample6 A1=new sample6();
	A1.m25();
	System.out.println(A1.a);
	
}
	protected void m25()
	{
		System.out.println("HII ....GOOD EVENING");
	}
	
}
