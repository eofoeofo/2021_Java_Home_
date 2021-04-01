package java_backstep;

import java.util.Arrays;

public class Shuffle {
	public static int[] Shuffle(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int j = (int)(Math.random()* arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = new int[9];
		
		for(int i = 0; i < original.length; i++) {
			original[i] = i+1;
		}
		int[] result = Shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}
