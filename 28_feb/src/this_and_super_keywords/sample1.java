package this_and_super_keywords;

public class sample1
{
  int a=50;
  int b=30;
  
  public void m1()
  {
	  int a=10;
	  System.out.println(a);
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(this.a);
  }
	
	public static void main(String[] args) 
	{
		
		sample1 S1=new sample1();
		S1.m1();
	}
	
	
	
}
