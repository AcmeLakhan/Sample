package inter;

public class City {

	public static void main(String[] args) {

		String str = "lakhanbabar137@gmail.com";	// a e i o u --> lkhnbbr
		String temp = "";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && 
					str.charAt(i)!='u' && Character.isLetter(str.charAt(i))) 
				temp = temp + str.charAt(i);
		}
		for(int j=temp.length()-1; j>=0; j--) {
			result = result + temp.charAt(j);
		}
		System.out.println("Given string: " + str);
		System.out.println("String without ovels: " + temp);
		System.out.println("Reverse string ovels: " + result);
	}
	
}