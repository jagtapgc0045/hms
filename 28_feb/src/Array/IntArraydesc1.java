package Array;

import java.util.Arrays;

public class IntArraydesc1 
{
	public static void main(String[] args) 
	 {
		//Array declaration
		 
		 int[] ar=new int[5];
		 
		 //Array initialisation
		    ar[0]=300;
			ar[1]=100;
			ar[2]=200;
			ar[3]=400;
			ar[4]=500;
			
		 Arrays.sort(ar);   //to create ascending 
		 
		 //usage
			
		 for(int i=ar.length-1; i>=0; i--)
		 {
			 System.out.println(ar[i]);
		 }
		 
		 
	 }
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
