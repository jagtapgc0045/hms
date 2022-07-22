package Logical_program;

import java.util.Scanner;

public class Accept_String_input_from_user 
{
	
	//Accept string input from user
	public static void main(String[] args) 
	{
		//Create object of scanner class
		Scanner scan=new Scanner(System.in);
		
		//call the methods
		System.out.println("Enter student name:");
		
		String s1=scan.next();
		System.out.println(s1);
	}

}
