package inter;

import java.util.Scanner;

public class Bt2 {
	// Write Java code to identify a number as Palindrome. 121
	
	public static void main(String[] args) {
		System.out.println("Enter number to validate if it is palindrome or not: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem;
		int temp = 0, original = num;
		while(num>0) {
			rem = num % 10;
			temp = (temp * 10) + rem;
			num = num / 10;
		}
		if(original==temp)
			System.out.println("Given  number " + original + " is palindrome.");
		else
			System.out.println("Given  number " + original + " is not palindrome.");
		sc.close();
	}
}
