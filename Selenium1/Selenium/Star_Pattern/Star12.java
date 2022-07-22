package Star_Pattern;

public class Star12 
{
	//  *
	// **
	// ***
	//****
	// ***
	// **
	//  *

	public static void main(String[] args) 
	{
		int space=4;
		int star=1;
		
		for(int i=1; i<=7; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
			if(i<=3)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}
		
	}
}
