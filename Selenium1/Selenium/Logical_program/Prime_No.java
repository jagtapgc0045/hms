package Logical_program;

public class Prime_No 
{
	
	public static void main(String[] args) 
	{
		int num=7;
		
		int count=0;
		
		for(int i=2; i<7; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Given no is not prime no");
		}
		else
		{
			System.out.println("Given no is prime no");
		}
	}

}
