package inter;

// { 15, 24, 48, 21, 43, 11, 79, 93 }
// Write a Java program to find out the first two max values from an array.

import java.util.ArrayList;
import java.util.TreeSet;

public class Bt {

	public static void main(String[] args) {
		System.out.println("Java Version: " + System.getProperty("java.version"));
		int[] arr = { 15, 24, 48, 21, 43, 11, 79, 93 };
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int a : arr) 
			ts.add(a);

		ArrayList<Integer> al = new ArrayList<Integer>(ts);

		for (int i = al.size() - 1; i >= al.size() - 2; i--) 
				System.out.println(al.get(i));
	}

}
