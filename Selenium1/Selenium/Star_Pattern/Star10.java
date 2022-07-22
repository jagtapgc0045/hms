package Star_Pattern;

public class Star10 
{
	//right pascal triangle
	//*
	//**
	//***
	//****
	//***
	//**
	//*
	
	public static void main(String[] args) 
	{
		int star=1;
		for(int i=1; i<=7; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=3)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}
