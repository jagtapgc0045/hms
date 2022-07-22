package Open_Browser;

public class Method_with_return_type2 
{

	public static void main(String[] args) 
	{
		int num1=50;
		
		int num2=addition(10,60);
		
		System.out.println(num1+num2);
		
		System.out.println(num1*num2);
		
		
		
	}
	
	public static int addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
		return sum;
	}
	
	
	
}
