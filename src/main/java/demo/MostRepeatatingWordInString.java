package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MostRepeatatingWordInString {

	public static void main(String[] args) {
		String str =  "This is a test statement is to test test";
		findMostFrequentWord(str);
		findMostRepeatingWord(str);
	}

	public static void findMostFrequentWord(String str) {
		int n = 1;
		String s = "";
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			int counter = 1;
			String word = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(word.equals(arr[j])) {
					counter++;
				}
			}
			if(counter>n) {
				s = arr[i];
				n = counter;
			}
		}
		System.out.println(s + n);
	}
	
	public static void findMostRepeatingWord(String str) {
		HashMap<String, Integer> hm = makeHashMap(str);
		int max = findMaxValueFromHM(hm);
		Set<Entry<String, Integer>> entries = hm.entrySet();
		for(Entry<String, Integer> entry : entries) {
			if(max==entry.getValue())
				System.out.println(entry.getKey());
		}
	}

	private static int findMaxValueFromHM(HashMap<String, Integer> hm) {
		int arr[] = new int[hm.size()];
		int counter = 0;
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			arr[counter] = hm.get(key);
			counter++;
		}
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

	private static HashMap<String, Integer> makeHashMap(String str) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] arr = str.split("\\s");
		for(String a : arr) {
			if(hm.containsKey(a))
				hm.put(a, hm.get(a)+1);
			else
				hm.put(a, 1);
		}
		return hm;
	}
}
