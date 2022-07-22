package this_and_super_keywords;

public class sample2 extends sample3
{
	
  int a=22;     //global variable
  
public void m2()
{
	int a=10;   //local variable
	
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	

}

public static void main(String[] args) 
{
	sample2 S2=new sample2();
	S2.m2();
}

}
