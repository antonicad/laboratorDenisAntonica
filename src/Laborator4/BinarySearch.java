package Laborator4;

public class BinarySearch {
	public static void main(String[] args) {
		int haystack[] = {4, 8, 15, 16, 23, 42, 51, 61, 88};
		int needle = 61;
		
		int index = iterativeBinarySearch(haystack, needle);
		System.out.println(index);
		
		int left = 0;
		int right = haystack.length;
		int index2 = recursiveBinarySearch(haystack, needle, left, right);
		System.out.println(index2);
	}

	public static int iterativeBinarySearch(int[] haystack, int needle) 
	{
		int left = 0;
		int right = haystack.length - 1;
		
		while (left < right) {
			int middle = left + (right - left) / 2;
//			int middle = (right + left) /2;
			
			if (haystack[middle] == needle) {
				return middle;
			}
			
			if (haystack[middle] < needle) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] haystack, int needle, int left, int right) 
	{
		if (left < right) {
			int middle = left + (right - left) / 2;
			
			if (needle < haystack[middle]) {
				return recursiveBinarySearch(haystack, needle, left, middle);
			} else if (needle > haystack[middle]) {
				return recursiveBinarySearch(haystack, needle, middle, right);
			} else {
				return middle;
			}
		} 
		
		
		return -1;
	}
}
