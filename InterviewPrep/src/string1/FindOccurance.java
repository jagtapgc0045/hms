package string1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindOccurance {
	 //static int count;
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String input=sc.nextLine();
		findOccurance(input);
		//usingHashMap(input);
		sc.close();
	}
	
	public static void findOccurance(String a)
	{
		StringBuilder s=new StringBuilder(a);
		ArrayList<Character> arr=new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					s.deleteCharAt(j);
					
				}
				
			}
			if(s.charAt(i)==' ') {
				System.out.println("Spaces reapeted "+(count+1)+" times");
			}
			else {
			System.out.println(s.charAt(i)+" reapeted "+(count+1)+" times");
			}
			if(arr.contains(s.charAt(i)))
			{
				arr.add(s.charAt(i));
				break;
			}
			
			
		}
		
	}
	
	public static void usingHashMap(String a)
	{
		String str = "SSDRRRTTYYTYTR";
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = a.length() - 1; i >=0; i--) {
	         if (hMap.containsKey(a.charAt(i))) {
	            int count = hMap.get(a.charAt(i));
	            hMap.put(a.charAt(i), ++count);
	         } else {
	            hMap.put(a.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	}
	

}
