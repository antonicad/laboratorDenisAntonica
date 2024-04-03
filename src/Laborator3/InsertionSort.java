package Laborator3;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
        int arr[] = {42, 8, 4, 16, 23, 15};
        insertionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
	}

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) { // 2
			int currentElement = arr[i]; // 4
			
			int currentIndex = i - 1; // 1
			//
			System.out.println("In sort: " + Arrays.toString(arr));
			System.out.println("	currentElement: " + currentElement + " at index " + currentIndex);
			//
			while (currentIndex >= 0 && currentElement < arr[currentIndex]) {
				arr[currentIndex + 1] = arr[currentIndex]; // arr[1] = arr[0] -> arr[1] =42 
				currentIndex--; // 0
			}
			System.out.println("	new index curentElement: " + (currentIndex+1));
			arr[currentIndex + 1] = currentElement;
		}
	}
	
    public static void printArray(int arr[])
    {
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
