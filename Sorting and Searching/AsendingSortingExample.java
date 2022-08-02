package Mine;

import java.util.Arrays;

public class AsendingSortingExample {
	public static void main(String[] args) {
		int[]numbers=new int[] { 8, 4, 3,5,6,};
		String[]strArr= {"C", "O", "I", "P", "U",};
		Arrays.sort(numbers);
		Arrays.sort(strArr);
		System.out.println("integer sorted array");
		System.out.println(Arrays.toString(numbers));
		System.out.println("string sorted array");
		System.out.println(Arrays.toString(strArr));
		

	}

}


