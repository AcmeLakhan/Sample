package demo;

public class RemoveSpecialCharactesFormString {
	public static void main(String[] args) {
		String str = "I@Love#My%India";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) 
				result = result + str.charAt(i);
			else
				result = result + " ";
		}
		
		System.out.println(str + " ==> " + result.trim());
	}
}
