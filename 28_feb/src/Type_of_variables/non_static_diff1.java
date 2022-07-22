package Type_of_variables;

public class non_static_diff1 
{
   //non static global variable call from different class
	
	public static void main(String[] args)
	{
		//create object of different class
		non_static_diff2 Z2=new non_static_diff2();  //classname objectname= new classname();
		
		//call variable
		System.out.println(Z2.z);   //printing statement(ojectname.variablename);
	}
	
	
	
	
}
