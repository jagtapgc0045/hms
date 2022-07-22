package Star_Pattern;

public class Star5 
{
	//****
	//***
	//**
	//*
	public static void main(String[] args) 
	{
		int star=4;
		
		for(int i=1; i<=4; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		
	}

}
