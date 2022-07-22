package Logical_program;

public class Armstrong_No 
{
	public static void main(String[] args) 
	{
		int org=153;
		
		int sum=0;
		
		for(int i=org; i>=0; i=i/10)
		{
			int rem=i%10;
			
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		
		if(org==sum)
		{
			System.out.println("Given no is an Armstrong no");
		}
		else
		{
			System.out.println("Given no is not an Armstrong no");
		}
	}

}
