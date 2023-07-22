package demo;


class A {
	static int a =10;
	public static void func() {
		System.out.println("Class A method is called");
	}
}

public class Inheritance extends A{
	
	public static void main(String[] args) {
		func();
		a = 15;
		int q = (int) 'c';
		System.out.println(q);
	}
}
