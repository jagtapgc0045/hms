package Access_specifier;

public class sample4 
{
  //default ------access specifier
	
	int a=25;
	
	public static void main(String[] args) 
	{
		//create object
		sample4 D1=new sample4();
		D1.m2();
		System.out.println(D1.a);
		
	}
	
	void m2()
	{
		System.out.println("good night");
	}
	
}
