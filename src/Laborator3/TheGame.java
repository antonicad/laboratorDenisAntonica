package Laborator3;

import java.util.Arrays;

public class TheGame {
	public static void main(String[] args) {
		int[] arr = {1, 4, 19, 14, 42, 0, 34 };
//		int[] arr2 = {1, 4, 19, 14, 42, 0, 23, 34 };
		int solution = solveTheGame(arr);
		System.out.println(solution);
	}
	
	public static int solveTheGame(int[] arr) 
	{
		Arrays.sort(arr);
		
		return arr[(arr.length-1)/2];
	}
}
