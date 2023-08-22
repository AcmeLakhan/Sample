package demo;

import java.util.ArrayList;

public class StringSplitting {

	public static void main(String[] args) {
		String str = "ILoveMyIndia";

		System.out.println(makeStringOfGivenNoOfLength(str, 3));
		System.out.println(splitStringIntoGivenNoOfEqualPart(str, 3));
	}

	public static ArrayList<String> makeStringOfGivenNoOfLength(String str, int n) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < str.length(); i += n) {
			al.add(str.substring(i, i + n));
		}
		return al;
	}

	public static ArrayList<String> splitStringIntoGivenNoOfEqualPart(String str, int n) {
		ArrayList<String> al = new ArrayList<String>();
		int count = str.length() / n;
		for (int i = 0; i < str.length(); i += count) {
			al.add(str.substring(i, i + count));
		}
		return al;
	}
}
