package Access_specifier;

public class sample5
{
  // default---- use of default access specifier
  // call from different class
  // only use for package only
	
	public static void main(String[] args)
  {
		//create object
		sample4 D2=new sample4();
		D2.m2();
		System.out.println(D2.a);
		
  }
	
}
