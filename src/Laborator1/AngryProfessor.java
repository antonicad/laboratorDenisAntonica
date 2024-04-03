package Laborator1;

import java.util.Arrays;

public class AngryProfessor {
	public static void main(String args[]) {

//		int threshold = 3;
//		int[] arrivalTimes = {-1, -3, 2, 4};
		int threshold = 2;
		int[] arrivalTimes = {0, -1, 2, 1};
		
		boolean classIsCanceled = isCanceled(threshold, arrivalTimes);
		
		if (classIsCanceled) {
			System.out.println("Class is canceled.");
		} else {
			System.out.println("Class is NOT canceled.");
		}
	}
	
//	public static boolean isCanceled(int threshold, int[] times) {
//		int countOnTime = 0;
//		
//		for (int time: times) {
//			if (time <= 0) {
//				countOnTime++;
//			}
//		}
//		
//		return countOnTime < threshold;
//	}

//	public static boolean isCanceled(int threshold, int[] times) {
//		times = Arrays.stream(times).filter(x -> x >= 0).toArray();
//		
//		
//		return times.length < threshold;
//	}
	
	public static boolean isCanceled(int threshold, int[] times) {
		Arrays.sort(times);
//		 {-1, -3, 2, 4};  => -3 -1 2 4
		return times[threshold - 1] > 0;
	}
}
