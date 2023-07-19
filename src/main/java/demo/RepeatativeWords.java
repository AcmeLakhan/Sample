package demo;

import java.util.HashMap;
import java.util.Set;

public class RepeatativeWords {

	public static void main(String[] args) {
		String str = "lakhan babar akash mahadeo babar lakhan";
		String[] strArr = str.split("\\s");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String a : strArr) {
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			} else {
				hm.put(a, 1);
			}
		}
		Set<String> keySet = hm.keySet();
		
		for(String key : keySet) {
			if(hm.get(key)>1) {
				System.out.print(key + " ");
			}
		}
	}

}
