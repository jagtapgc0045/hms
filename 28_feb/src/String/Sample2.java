package String;

public class Sample2 
{
 
 public static void main(String[] args) 
{
	//without using new keyword
	 
	 String S1="xyz";
	 String S2="xyz";
	 String S3="xyz1";
	 
	//with using new keyword
	 
	 String S4=new String("xyz");
	 String S5=new String("xyz");
	 String S6=new String("xyz1");
	 
	 System.out.println(S1==S2);
	 System.out.println(S4==S5);
	 System.out.println(S1==S3);
	 System.out.println(S1==S4);
	 System.out.println(S5==S6);
	 
}
	
	
	
	
	
}
