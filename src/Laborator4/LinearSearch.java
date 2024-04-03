package Laborator4;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
	public static void main(String[] args)
	{
		int haystack[] = {42, 8, 4, 16, 23, 15, 16};
		int needle = 16;
		
		int index = search(haystack, needle);
		List<Integer> indexes = multipleSearch(haystack, needle);
		System.out.println(index);
		System.out.println(indexes);
	}
	
	public static int search(int[] haystack, int needle) 
	{
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static List<Integer> multipleSearch(int[] haystack, int needle) 
	{
		List<Integer> positions = new ArrayList<Integer>();
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle) {
				positions.add(i);
			}
		}
		
		return positions;
	}
}
