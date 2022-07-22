package Main_method;

public class main_method 
{
   public static void main(String[] args) 
   {
	int num=addition(20,30);

	 System.out.println(num);  
	 
	 main();
	   
   }
	
	public static int addition(int a,int b)   //main method return type
	{
		int sum=a+b;
		
		return sum;
		
	}
	
	public static void main(int... args)    // main method changes
	{
		System.out.println("HELLO");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
