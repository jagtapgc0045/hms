package String;

public class String_Class_Methods 
{
 public static void main(String[] args) 
{
	String S1="velocity";
	String S2="";
	String S3="ABCD";
	String S4="VELOCITY";
	String S5="city";
	String S6="abcabab";
	String S7="Classes";
	
	
	System.out.println(S1.length());        //To find lenghth of string
	 
	System.out.println(S2.isEmpty());       //To verify string is empty or not
	 
	System.out.println(S1.toUpperCase());   //To print string in Uppercase
	 
	System.out.println(S3.toLowerCase());   //To print string in Lowercase
	
	//Compare 2 Strings
	System.out.println("-----------------");
	
	System.out.println(S1.equals(S4));            //To compare 2 strings (S1 & S4) with case sensitive
	
	System.out.println(S1.equalsIgnoreCase(S4));  //To compare 2 strings (S1 & S4) without case sensitive
	
	System.out.println(S1.contains(S5));          //To compare 2 strings & check matching info
	
	System.out.println(S4.contains(S5));          //To compare 2 strings & check matching info
	
	System.out.println(S1.charAt(4));             //To get single character
	
	System.out.println(S1.startsWith("ve"));      //To verify  string S1 starts with "ve" with case sensitive
	
	System.out.println(S3.startsWith("ABC"));     //To verify  string S1 starts with "ve" with case sensitive
	
	System.out.println(S1.endsWith("city"));      //To verify  string S1 ends with "ve" with case sensitive
	
	System.out.println(S1.startsWith("VE"));
	
	System.out.println(S1);
}
	
	
	
	
	
	
	
	
	
}
