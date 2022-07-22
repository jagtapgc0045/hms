package Star_Pattern;

public class Star8 
{
	//pyrmid star pattern

	public static void main(String[] args) 
	{
		int space=3;
		int star=1;
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
				space--;
				star=star+2;
			
		}
	}
}
