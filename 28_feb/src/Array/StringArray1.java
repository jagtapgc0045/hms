package Array;

public class StringArray1 
{
	public static void main(String[] args) 
	{
		//Array declaration
		
		String[] A=new String[4];
		
		//Array initialisation
		
		A[0]="VIRAT";
		A[1]="ROHIT";
		A[2]="RAHUL";
		A[3]="MSD";
		
		//Usage
		
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);
		
		System.out.println("---------------------------------------");
		
		//OR
		
		for(int i=0; i<=3; i++) 
		{
			System.out.println(A[i]);
		}
		System.out.println("------------------------------------------");
		//OR
		
		for(int i=0; i<=A.length-1; i++)
		{
		System.out.println(A[i]);	
		}
		System.out.println("---------------------------------------------");
		
		System.out.println(A.length);
		
		
	}
	
	

}
