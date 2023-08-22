package inter;

public class HackerRank {

	public static void main(String[] args) {
		int[] arr = {12, 55, 63, 94, 61, 2, 45, 86};
		int[] result = findMaximum(arr);
		System.out.println("First maximum no : " + result[0]);
		System.out.println("Second maximum no : " + result[1]);
	}

	private static int[] findMaximum(int[] arr) {
		int fmax = 0;
		int smax = 0;
		
		for(int i=0;i<arr.length;i++) {
			int value = arr[i];
			if(value>fmax) {
				smax = fmax;
				fmax = value;
			} else if(value>smax) {
				smax = value;
			}
		}
		int[] result = {fmax, smax};
		return result;
	}
}
