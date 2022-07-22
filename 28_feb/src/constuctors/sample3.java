package constuctors;

public class sample3
{
 int num1;
 int num2;
 String studentname;
 char studentgrade;
 
 sample3()      //without parameter user defined constructor
 {
	 num1=5;
	 num2=6;
 }
 
 sample3(int a, int b)   //with parameter user defined constructor.....int
 {
	 num1=a;
	 num2=b;
 }
 
 sample3(String sname)  //with parameter user defined constructor....string
 {
	studentname=sname; 
 }
 sample3(char grade)
 {
	studentgrade=grade;
 }
	
	public void addition()
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public void multiplication()
	{
		int mvalue=num1*num2;
		System.out.println(mvalue);
	}
		
	public void studentinfo()
	{
		System.out.println(studentname);
	}
	public void student3()
	{
		System.out.println(studentgrade);
	}
	
	
	
	
	
	
}
