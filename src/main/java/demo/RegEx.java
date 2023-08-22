package demo;

public class RegEx {

	public static void main(String[] args) {
		String str = "lakhan babar 9192@# gmail .com";
		
		// it keeps all chars and space and number {use ^}
		System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));	 
		
		// it remove all case ovals only
		System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
	}
}
