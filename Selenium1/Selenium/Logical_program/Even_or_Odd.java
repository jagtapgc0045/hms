package Logical_program;

import java.util.Scanner;

public class Even_or_Odd 
{
	//Even Or Odd
		public static void main(String[] args) 
		{
			//Create object of scanner class
			Scanner scan=new Scanner(System.in);
			
			//call the methods
			System.out.println("Enter Num:");
			int Num=scan.nextInt();
			
	        if(Num%2==0)
			{
				System.out.println("Given no is Even");
			}
			else
			{
				System.out.println("Given no is Odd");
			}
	}

}
