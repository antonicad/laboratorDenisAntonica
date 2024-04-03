package Laborator3;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {42, 8, 4, 16, 23, 15};
		System.out.println("Before sort: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println("After sort: " + Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {

			int partitionIndex = partition(arr, leftIndex, rightIndex);
			System.out.println("partitionIndex: " + partitionIndex);
			System.out.println(Arrays.toString(arr));
			quickSort(arr, leftIndex, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, rightIndex);
		}
	}

	private static int partition(int arr[], int leftIndex, int rightIndex) {

		int pivot = arr[rightIndex];
		int i = leftIndex - 1; 
		for (int j = leftIndex; j < rightIndex; j++) {

			if (arr[j] <= pivot) {
				i++;
				swap(arr, j, i);
			}
		}
		
		swap(arr, rightIndex, i+1);
		return i + 1;
	}

	
	private static void swap(int[] a, int source, int destination) {
		int temp = a[destination];
		a[destination] = a[source];
		a[source] = temp;
	}
}
