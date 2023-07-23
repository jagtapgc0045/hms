package IntToString;

public class IntToString1 {
	public static void main(String[] args) {
//		int a=001234;
//		String b=String.valueOf(a);  
//		System.out.println(a);
		int number = 01234; // Example number starting with zero

        // Convert the number to a string
        String numberString = String.valueOf(number);

        // Reverse the string
        StringBuilder reversedString = new StringBuilder(numberString).reverse();

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedString.toString());

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
	}

}
