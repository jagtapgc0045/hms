package IntToString;

public class stringConcatenation {
	public static void main(String[] args) {
		String a="^[a-zA-Z0-9_+&*-]+(?:\\\\.\"+\r\n"
				+ "\"[a-zA-Z0-9_+&*-]+)*@\" +\r\n"
				+ "\"(?:[a-zA-Z0-9-]+\\\\.)+[a-z\" +\r\n"
				+ "\"A-Z]{2,7}$";
		System.out.println(a);
	}

}
