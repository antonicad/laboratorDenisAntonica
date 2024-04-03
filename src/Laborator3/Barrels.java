package Laborator3;

import java.util.Arrays;

public class Barrels {

	public static void main(String[] args) 
	{
		int[] barrels = {4, 8, 5, 6, 7};
		int moves = 2;
		
		int solution = countWater(barrels, moves);
		System.out.println(solution);
	}
	
//	public static int countWater(int[] barrels, int moves)
//	{
//		Arrays.sort(barrels);
//		int count = 0;
//		// {4, 5, 6, 7, 8};
//		for (int i = barrels.length-1; i >= barrels.length - 1 - moves; i-- ) {
//			count+= barrels[i];
//		}
//		
//		return count;
//	}
	
	public static int countWater(int[] barrels, int moves)
	{
		Arrays.sort(barrels);
		int[] kBarrels = Arrays.copyOfRange(barrels, barrels.length - moves -1, barrels.length);
		
		return Arrays.stream(kBarrels).sum();
	}
}
