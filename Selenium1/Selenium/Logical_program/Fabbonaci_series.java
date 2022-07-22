package Logical_program;

public class Fabbonaci_series 
{
	public static void main(String[] args) 
	{
		//0 1 2 3 5 8 13 21 34
		
		int a=0;
		int b=1;
		
		int c;
		  //i=1   1<=10   2
		        //2<=10   3
		        //3<=10   4
		        //4<=10   5
		
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
