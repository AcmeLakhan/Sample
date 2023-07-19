package demo;

public class ReverseStringPreservingSpace {

	public static void main(String[] args) {
		String str = "I Love My India"; //==> I evoL yM aidnI 
		
		String[] strArr = str.split(" ");
		
		String result = "";
		
		for(String word : strArr) 
			result = result + " " + reverseWord(word);
		
		System.out.println("Given  : " + str);
		System.out.println("Result : " + result.trim()); 
	}
	
	public static String reverseWord(String str) {
		String word ="";
		for(int i=str.length()-1; i>=0; i--) 
			word = word + str.charAt(i);
		
		return word;
	}

}
