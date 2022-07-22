package methods;

public class method1 
{
 public static void main (String[]args)
 {
	 
	 addition();                  //methodname();
	 addition(30,40);             //methodname();
	 additionsum(50,60,70);       //methodname();
	 multiplication(10,20);       //methodname();
	 divide(50,25);               //methodname();
	 
	 method1 abc=new method1();   //classname objectname= new classname();
     abc.add(50,50);              //objectname.methodname();
     abc.add1(125, 125);
 }
 //static regular method without parameter
 public static void addition()
 {
	 int a;
	 a=10;
	 int b;
	 b=20;
	 
	 int c;
	 c=a+b;
	 System.out.println(c);
}
 //static regular method with parameter......2..parameter
 public static void addition(int a, int b)
 {
	 int c=a+b;
	 System.out.println(c);
 }
//static regular method with parameter......3..parameter
 public static void additionsum(int p,int q, int r )
 {
	 int c=p+q+r;
	 System.out.println(c);
 }
 public static void multiplication(int x, int y)
 {
	 int c=x*y;
	 System.out.println(c);
 }
 public static void divide(int m, int n )
 {
	int c=m/n;
	 System.out.println(c);
 }
 //non static method
 public void add(int r, int t)
 {
	 int c=r+t;
	 System.out.println(c);
 }
 //non static method
 public void add1(int r, int t)
 {
	 int c=r+t;
	 System.out.println(c);
 }
 
 
}
