package Star_Pattern;

public class Star4 
{
	//*
	//**
	//***
	//****
	public static void main(String[] args) 
	{
		int star=1;
		
		for(int i=1; i<=4; i++)
		{
			
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
	}

}
