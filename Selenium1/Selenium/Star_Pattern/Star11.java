package Star_Pattern;

public class Star11 
{
	//*****
	// ****
	//  ***
	//   **
	//    *
	//   **
	//  ***
	// ****
	//*****
	public static void main(String[] args) 
	{
		int space=0;
		int star=5;
		
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print("");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4)
			{
				star--;
				space++;
			
			}
			else
			{
				star++;
				space++;
			}
		}
		
	}

}
