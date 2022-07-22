package Logical_program;

public class White_spaces 
{

	public static void main(String[] args) 
	{
		String org="ab c d e f ";
		
		int count=0;
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char charvalue=org.charAt(i);
			
			if(charvalue==' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
