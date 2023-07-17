package inter;

import java.util.ArrayList;
import java.util.Scanner;

public class Bt3 {

	public static void main(String[] args) {
		String str = "Championship";	//12
		System.out.println("Enter split count for 'Championship' word : ");
		Scanner sc = new Scanner(System.in);
		int splitCount = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		int splitChars = str.length() / splitCount;	//2
		for(int i=0; i<str.length()-1;) {
			String temp = str.substring(i, i+splitChars);
			al.add(temp);
			i = i + temp.length();
		}
		System.out.println(str + " : " + al);
		sc.close();
	}
}

