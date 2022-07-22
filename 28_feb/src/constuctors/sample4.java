package constuctors;

public class sample4 
{
public static void main(String[] args)
{
	//create object of different class
	sample3 S1=new sample3();
	S1.addition();
	S1.multiplication();
	
	//create object of different class
	sample3 S2=new sample3(25,20);
	S2.addition();
	S2.multiplication();
	
	//create object of different class
	sample3 S3=new sample3(15,10);
	S3.addition();
	S3.multiplication();
	
	//create object of different class
	sample3 S4=new sample3("MAHESH");
	S4.studentinfo();
	
	//create object of different class
	sample3 S5=new sample3('A');
	S5.student3();
}
	
	
}
