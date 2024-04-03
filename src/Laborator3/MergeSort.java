package Laborator3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {42, 8, 4, 16, 23, 15};
        System.out.println("Before sort: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sort: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) { // 0 5

            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2; //2
            mergeSort(arr, leftIndex, middleIndex); // ms(arr, 0, 2) ms(arr, 0,1)
            mergeSort(arr, middleIndex + 1, rightIndex);
            merge(arr, leftIndex, middleIndex, rightIndex);
        }
    }


    private static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
//		System.out.println(Arrays.toString(arr));
//		System.out.println(leftIndex);
//		System.out.println(middleIndex);
//		System.out.println(rightIndex);
        int i, j, k;
        int leftLength = middleIndex - leftIndex + 1;
        int rightLength = rightIndex - middleIndex;


        int[] Left = new int[leftLength];
        int[] Right = new int[rightLength];

        for (i = 0; i < leftLength; i++)
            Left[i] = arr[leftIndex + i];
        for (j = 0; j < rightLength; j++)
            Right[j] = arr[middleIndex + 1 + j];

//		System.out.println(Arrays.toString(Left));
//		System.out.println(Arrays.toString(Right));


        i = 0;
        j = 0;
        k = leftIndex - 1; // -1
        while (i < leftLength && j < rightLength) {
            k++; // 0
            if (Left[i] < Right[j]) {
                arr[k] = Left[i]; //
                i++;
            } else {
                arr[k] = Right[j]; // arr[0] = 4
                j++; // 1
            }
        }

        while (i < leftLength) { // 0 , 1, 2
            k++; // 1 , 2
            arr[k] = Left[i]; // arr[1] = 8, 42
            i++; // 1, 2
        }

        while (j < rightLength) { //
            k++; //
            arr[k] = Right[j]; //
            j++;
        }
    }
}

