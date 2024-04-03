package Laborator3;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {42, 8, 4, 16, 23, 15};
		System.out.println("Before sort: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After sort: " + Arrays.toString(arr));
	}

	private static void selectionSort(int arr[]) {
		//
		for (int i = 0; i < arr.length - 1; i++) {

			int minPosition = i; // 0
			for (int j = i + 1; j < arr.length; j++) { 
				if (arr[j] < arr[minPosition]) // arr[2] 4 <> arr[1] 8 
					minPosition = j; // 2
			}
			
			if (minPosition != i) {
				swap(arr, minPosition, i); 
			}
		}
	}
	
	private static void swap(int[] arr, int source, int destionation) {
		int temp = arr[destionation];
		arr[destionation] = arr[source];
		arr[source] = temp;
	}
}
