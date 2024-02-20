package javaLearning;

import java.util.Arrays;

public class arraytest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,2};
//		System.out.println(Arrays.toString(arr));
//		int[] x=Arrays.toString(arr);
//		System.out.println(x);
//		System.out.println(Arrays.sort(arr));
//		System.out.println(Arrays.sort(x));
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(Arrays.sort(arr)));
		System.out.println("sorted array is "+Arrays.toString(arr));
//		System.out.println("sorted arrays is"+Arrays.sort(arr));
		String x = Arrays.toString(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("the sorted array using enhanced for loop");
		for(int s:arr) {
			System.out.print(s+" ");
		}

	}

}
