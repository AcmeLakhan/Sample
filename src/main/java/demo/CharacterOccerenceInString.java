package demo;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccerenceInString {

	public static void main(String[] args) {
		String str = "Lakhan Mahadeo Babar";
		System.out.println(str);
		String strArr[] = str.split("");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s : strArr) {
			if(hm.containsKey(s)) 
				hm.put(s, hm.get(s)+1);
			 else 
				hm.put(s, 1);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to  check occerence: ");
		String s = sc.next();
		System.out.println(s + " comes " + hm.get(s) + " times");
		sc.close();
	}

}
