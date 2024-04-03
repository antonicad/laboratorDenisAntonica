package Laborator3;

public class BubbleSort {
    public static void main(String args[])
    {
        int arr[] = {42, 8, 4, 16, 23, 15};
        bubbleSort(arr);
//        bubbleSortSlightlyOptimized(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
	
	public static void bubbleSort(int[] arr) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					swap(arr, i-1, i);
					sorted = false;
				}
			}
		}
	}

	public static void bubbleSortSlightlyOptimized(
			int[] arr
			) 
	{
		boolean sorted = false;
		int lastElementIndex = arr.length; // 6
		int lastChangeIndex = 0;
		
		while (!sorted) {
			sorted = true;
			for (int i = 1; i < lastElementIndex; i++) {
				if (arr[i] < arr[i - 1]) {
					swap(arr, i-1, i);
//					swap(arr, 0, 1);
					sorted = false;
					lastChangeIndex = i;
				}
			}
			lastElementIndex = lastChangeIndex;  // 4 
		}
	}
	
 
    public static void printArray(int arr[])
    {
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
	private static void swap(
			int[] arr, 
			int source, 
			int destination
			) 
	{
//		swap(arr, 0, 1);
		int temp = arr[destination]; // 8
		arr[destination] = arr[source]; // arr[1] = 42
		arr[source] = temp; // arr[0] = 8
	}
}
