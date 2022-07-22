package Star_Pattern;

import java.util.HashMap;
import java.util.Set;

public class Occurance_of_each_character_using_hashmap 
{
	public static void main(String[] args) 
	{
		String org="abcabcaabbdd";
		
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char charvalue=org.charAt(i);
			
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue, charvalue+1);
			}
			else
			{
				mp.put(charvalue, 1);
			}
			
			Set<Character> Keys=mp.keySet();
			
			for(Character Key:Keys)
			{
				System.out.println(Key+":"+mp.get(Key));
			}
		}
	}

}
