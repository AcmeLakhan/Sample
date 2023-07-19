package demo;

import java.util.Collection;
import java.util.HashMap;

public class AnagramString {

	public static void main(String[] args) {
		String firstString = "AC TQ F ";
		String secondStrig = "QC AT e";
		
		if(firstString.length()==secondStrig.length()) {
			HashMap<Character, Integer> firstHM = new HashMap<Character, Integer>();
			HashMap<Character, Integer> secondHM = new HashMap<Character, Integer>();
			
			for(int i=0; i<firstString.length(); i++) {
				if(firstHM.containsKey(firstString.charAt(i))) {
					firstHM.put(firstString.charAt(i), firstHM.get(firstString.charAt(i))+1);
				} else {
					firstHM.put(firstString.charAt(i),  (int)Character.toLowerCase(firstString.charAt(i)));
				}
			}
			Collection<Integer> firstHMValue = firstHM.values();
			int firstHMSum = 0;
			for(Integer a : firstHMValue) {
				firstHMSum = firstHMSum + a;
			}
			
			for(int i=0; i<secondStrig.length(); i++) {
				if(secondHM.containsKey(secondStrig.charAt(i))) {
					secondHM.put(secondStrig.charAt(i), secondHM.get(secondStrig.charAt(i))+1);
				} else {
					secondHM.put(secondStrig.charAt(i), (int)Character.toLowerCase(secondStrig.charAt(i)));
				}
			}
			Collection<Integer> secondHMValue = secondHM.values();
			int SecondHMSum = 0;
			for(Integer a : secondHMValue) {
				SecondHMSum = SecondHMSum + a;
			}

			if(firstHMSum==SecondHMSum) {
				System.out.println("Both string are ANAGRAM");
			} else {
				System.out.println("Both string are not ANAGRAM");
			}
		} else {
			System.out.println("Both string are not ANAGRAM");
		}
	}

}
