package demo;

public class DifferenceBetIsEqualToAndEqualsMethos {
	public static void main(String[] args) {
		String str1 = "lakhan";
		String str2 = "lakhan";
		String str3 = new String("lakhan");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str3));
	}
}
