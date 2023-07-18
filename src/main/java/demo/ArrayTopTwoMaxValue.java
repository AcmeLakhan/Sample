package demo;

public class ArrayTopTwoMaxValue {

	public static void main(String[] args) {
		//			 1	2	3  4   5   6   7  8	
		int[] arr = {9, 72, 8, 15, 64, 13, 3, 46};
		
		int firstMaxValue = 0;
		int secondMaxValue = 0;
		
		for(int i=0; i<arr.length; i++) {
			int value = arr[i];
			if(firstMaxValue<value) {
				secondMaxValue = firstMaxValue;
				firstMaxValue = value;
			} else if(secondMaxValue<value) {
				secondMaxValue = value;
			}
		}
		
		System.out.println("First  maximum value is: " + firstMaxValue);
		System.out.println("Second maximum value is: " + secondMaxValue);
	}

}
