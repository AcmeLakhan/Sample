package demo;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	public static Integer factorial(int n) {
		int result = 1;
		while(n>0) {
			result = result * n;
			n--;
		}
		return result;
	}
}
