package Generlisation;

public class sample 
{
public static void main(String[] args)
{
	Jio J1=new Jio();
	J1.sms();
	J1.audiocalling();
	J1.internet();
	System.out.println("------------------");
	Airtel A1=new Airtel();
	A1.sms();
	A1.audiocalling();
	A1.internet();
	System.out.println("------------------");
	VI V1=new VI();
	V1.sms();
	V1.audiocalling();
	V1.internet();
}
	
	
}
