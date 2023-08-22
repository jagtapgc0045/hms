package StringLogic;

public class ConvertFirstLetterToUppercase {
	public static void main(String[] args) {
		String a="i love my india";
		String[]  words=a.split("\\s");
		for(String b:words)
		{
			String letter1=b.substring(0,1);
			String rem=b.substring(1);
			System.out.print(letter1.toUpperCase()+rem+" ");
		}
		
	}

}
