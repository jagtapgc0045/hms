package constuctors;

public class sample2
{
  // variable declaration
	int a;
	int b;
	
	//variable initialization
	
	sample2()
	{
		a=20;
		b=30;
	}
	//usage
	
	public void addition()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		//create object of same class
		sample2 S2=new sample2();
		S2.addition();
	}
	
	
	
	
	
	
}
