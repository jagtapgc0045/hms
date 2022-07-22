package Star_Pattern;

public class Star7 
{
	//****
	// ***
	//  **
	//   *
	public static void main(String[] args) 
	{
		int space=0;
		int star=4;
		
		for(int i=1; i<=4; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}
