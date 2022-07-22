package Type_of_variables;

public class non_static_same1
{
    // non static global variable call from same class
	int a=90;
      
      public static void main(String[] args)
    {
		//crete object of same class
    	  
    	  non_static_same1 Z1=new  non_static_same1();
    	 
    	//call variable
    	  
    	  System.out.println(Z1.a);   //printing statement(objectname.variablename);
    	  
    	  
	}
	
	
	
	
	
	
	
}
