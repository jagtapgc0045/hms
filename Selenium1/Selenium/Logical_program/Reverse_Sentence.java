package Logical_program;

public class Reverse_Sentence 
{
	public static void main(String[] args) 
	{
		String org="I Am Playing";
	     
		String text=reversesentence(org);
		
		System.out.println(text);
		
	}
	
	public static String reversesentence(String Sentence)
	{
		String ar[]=Sentence.split("");
		
		String rev="";
		
		for(int i=ar.length-1; i>=0; i--)
		{
			rev=rev+ar[i]+"";
		}
		return rev;
	}

}
