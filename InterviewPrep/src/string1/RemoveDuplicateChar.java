package string1;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		String a=new String("sushants");
		StringBuilder s=new StringBuilder(a);
		//String b="";
		for(int i=0;i<=a.length()-1;i++)
		{
			for(int j=i;j<=a.length()-1;j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					s.deleteCharAt(i);
					break;
				}
			}
		}
		System.out.println(s);
//		int c=10;
//		 c=20;
//		a="jhgbb";
//		System.out.println(a);
//String V1=new String("Velocity");
//		
//	    V1.concat("Classes");  //expected--> VelocityClasses
//		
//		System.out.println(V1);
//		
//		a.concat(V1);
//		System.out.println(a);
//		a=a+"asfas";
//		System.out.println(a);
//		String a=new String ("abcd");//Non constant pool area
//		String b=new String ("abcd");
//		System.out.println(a==b);
//
//		String c="abcd";////Constant pool area
//		String d="abcd";
//		System.out.println(c==d);
		
		 
	}

}
