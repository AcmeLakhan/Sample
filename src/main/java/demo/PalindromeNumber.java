package demo;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number = 123;
		int reminder, temp = 0, given = number;
		
		while(number>0) {
			reminder = number%10;
			temp = temp * 10 + reminder;
			number = number/10;
		}
		if(given==temp) {
			System.out.println("Given number is palindrome => " + given +" : "+ temp);
		} else {
			System.out.println("Given number is not palindrome => "  + given +" : "+ temp);
		}
	}
}
