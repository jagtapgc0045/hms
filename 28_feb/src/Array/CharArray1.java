package Array;

public class CharArray1 
{
 public static void main(String[] args) 
 {
	 //Array declaraton
	 
	 char[] B=new char[4];
	
	 //Array initialisation
	 
	 B[0]='A';
	 B[1]='B';
	 B[2]='C';
	 B[3]='D';
			 
	 //Usage
	 
	 System.out.println(B[0]);
	 System.out.println(B[1]);
	 System.out.println(B[2]);
	 System.out.println(B[3]);
	 
	 System.out.println("----------------------------------------------");
	 
	 //OR
	 
	 for(int i=0; i<=B.length-1; i++)
	 {
		System.out.println(B[i]); 
	 }
	 System.out.println("-----------------------------------------------");
	 
	 //Print Reverse aray
	 
	 for(int i=3; i>=0; i--)
	 {
		System.out.println(B[i]); 
	 }
	 
 }
	
	
	
	
}
