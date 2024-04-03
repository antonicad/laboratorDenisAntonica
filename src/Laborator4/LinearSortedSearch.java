package Laborator4;

public class LinearSortedSearch {
	public static void main(String[] args)
	{
		int haystack[] = {4, 8, 15, 16, 23, 42};
		int needle = 13;
		
		int index = search(haystack, needle);
		int index2 = search2(haystack, needle);
		System.out.println(index);
		System.out.println(index2);
	}
	
	public static int search(int[] haystack, int needle) 
	{
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				return i;
			}
			if (haystack[i] > needle) {
				break;
			}
		}
		
		return -1;
	}
	
	public static int search2(int[] haystack, int needle) 
	{
		int i = 0;
		while (i< haystack.length && haystack[i] <= needle) {
			i++;
		}
		
		if (i == 0) {
			return -1;
		} else {
			return i-1;
		}
	}
}
