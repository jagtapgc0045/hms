package Star_Pattern;

public class Star3 
{
	 //1 2 3 4
  //1  * * * *
  //2  * * * *
  //3  * * * *
  
	public static void main(String[] args) 
	{
		
		//outer for loop for rows
		
		for(int i=1; i<=3; i++)
		{
			
			//inner for loop for column
			for(int a=1; a<=4; a++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
