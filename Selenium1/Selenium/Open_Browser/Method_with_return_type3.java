package Open_Browser;

public class Method_with_return_type3 
{

	public static void main(String[] args) 
	{
		String str="velocity";
		
	    String	str2=convertingstringtoUppercase(str);
	
	    System.out.println(str2);
		
	}
	
	public static String convertingstringtoUppercase(String s1)
	{
		String s2=s1.toUpperCase();
		
		System.out.println(s2);
		
		return s2;
	}
	
}
