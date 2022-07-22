package Logical_program;

public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		int org=1234;
		
		int rev=0;
		
		for(int i=org; i>0; i=i/10)
		{
			int rem=i%10;
			
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}

}
