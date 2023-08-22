package inter;

import java.util.HashMap;
import java.util.Set;

public class Insight {
	
	public static void main(String[] args) {
		String str = "lakhan mahadeo babar";	// lknm
		printOnlySingleOcerenceChars(str);
	}

	private static void printOnlySingleOcerenceChars(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) 
				hm.put(str.charAt(i), (hm.get(str.charAt(i))+1));
			 else 
				hm.put(str.charAt(i), 1);
		}
		Set<Character> keys = hm.keySet();
		for(Character key : keys) {
			if(hm.get(key)==1) {
				System.out.println(key + " : " + hm.get(key));
			}
		}
	}
}
