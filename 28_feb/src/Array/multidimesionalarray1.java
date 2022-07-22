package Array;

public class multidimesionalarray1
{
 public static void main(String[] args) 
 {
	int[][] A=new int[2][3];
	
	A[0][0]=10;
	A[0][1]=20;
	A[0][2]=30;
	A[1][0]=40;
	A[1][1]=50;
	A[1][2]=60;
	
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
