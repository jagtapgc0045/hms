package Logical_program;

import java.util.Scanner;

public class Add_2_No_by_taking_input_from_user 
{
	public static void main(String[] args) 
	{
		//create object of scanner class
		Scanner scan=new Scanner(System.in);
		
		//call the methods
		System.out.println("Enter Num1");
		int Num1=scan.nextInt();
		System.out.println(Num1);
		
		//call the methods
		System.out.println("Enter Num2");
		int Num2=scan.nextInt();
		System.out.println(Num2);
		
		//Add the numbers
		System.out.println(Num1+Num2);
		
		//Perform multiplication
		System.out.println(Num1*Num2);
	}

}
