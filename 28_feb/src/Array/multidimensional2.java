package Array;

public class multidimensional2 
{
	public static void main(String[] args) 
	 {
		int[][] A= {{10,20,30},{40,50,60}};
		
		//outer for loop for row
		
		for(int i=0; i<=1; i++)
		{
			//inner for loop for column
			
			for(int a=0; a<=2; a++)
			{
				System.out.print(A[i][a]+" ");
			}
			System.out.println();
		}
	 }
		
		
		
		
		
		
		
		

	}


