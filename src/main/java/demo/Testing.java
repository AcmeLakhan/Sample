package demo;


public class Testing {
	public static void main(String[] args) {
		Phone p1 = new Phone();
	    Phone p2 = new Phone();
//	    p1.price=3000;
	    Phone.color = "black";
	    System.out.println("p1 price is "+p1.price + " : " + Phone.color);
	    System.out.println("p2 price is "+p2.price);
	}
}
