package demo;

public class ArrayMaxValue {

	public static void main(String[] args) {
		int arr[] = {5, 9, 94, 3, 88, 46};
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) 
			if(max<arr[i]) 
				max = arr[i];
			
		System.out.println("Max value is: " + max);
	}

}
