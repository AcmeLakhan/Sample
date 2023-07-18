package demo;

public class ArrayMinValue {

	public static void main(String[] args) {
		int arr[] = {5, 9, 94, 3, 88, 46};
		
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++)
			if(min>arr[i])
				min = arr[i];
		
		System.out.println("Minimum value is: " + min);
	}

}
