package demo;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num = 123;
		int copy = num;
		int rem = 0;
		int res;
		
		while(num>0) {
			res = num % 10;	
			rem = rem * 10 + res;	
			num = num / 10;	
		}
		System.out.println(copy + " ==> " + rem);
		if(copy==rem)
			System.out.println("Given numbers are palindrome");
		else
			System.out.println("Given numbers are Not palindrome");
	}
}
