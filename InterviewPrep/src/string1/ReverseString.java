package string1;

import java.util.Scanner;

public class ReverseString {
	static String input;

	public static String getString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		return x;
	}

	public static void main(String[] args)

	{
		String input = ReverseString.getString();
		ReverseString.reverseString1(input);
		ReverseString.reverseString2(input);
		ReverseString.reversString3(input);

	}

	public static String reverseString1(String input) {
		String a = input;
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		System.out.println("By for Loop:-> "+b);
		System.out.println();
		return b;
	}

	public static StringBuffer reverseString2(String a) {
		StringBuffer sc = new StringBuffer(a);
		StringBuffer b = sc.reverse();
		System.out.println("By StringBuffer:-> "+b);
		System.out.println();
		return b;
	}
	public static void reversString3(String a)
	{
		StringBuilder sc=new StringBuilder(a);
		StringBuilder b=sc.reverse();
		System.out.println("By StringBuilder:-> "+b);
		System.out.println();
	}

}
