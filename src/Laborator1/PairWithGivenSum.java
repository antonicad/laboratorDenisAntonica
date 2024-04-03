package Laborator1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {
	public static void main(String[] args) {
		int[] numbers = { 8, 7, 2, 5, 3, 1 };
		int target = 10;
        
//        int[] numbers = {5, 2, 6, 8, 1, 9};
//        int target = 12;

 
        findPair(numbers, target);
	}
	
	
	public static void findPair(int[] numbers, int target) {
		for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == target)
                {
                    System.out.println("Pair found (" + numbers[i] + "," + numbers[j] + ")");
                    return;
                }
            }
        }
 
        System.out.println("Pair not found");
	}

	
//    public static void findPair(int[] numbers, int target)
//    {
//        Arrays.sort(numbers);
// 
//        int low = 0;
//        int high = numbers.length - 1;
////      1, 2, 3, 5, 7, 8 
//        while (low < high)
//        {
//            // sum found
//            if (numbers[low] + numbers[high] == target)
//            {
//                System.out.println("Pair found (" + numbers[low] + "," + numbers[high] + ")");
//                return;
//            }
// 
//            if (numbers[low] + numbers[high] < target) {
//                low++;
//            }
//            else {
//                high--;
//            }
//        }
//// 
//        System.out.println("Pair not found");
//    }
	
//    public static void findPair(int[] numbers, int target)
//    {
//        Map<Integer, Integer> map = new HashMap<>();
////        { 8, 7, 2, 5, 3, 1 };
//        for (int i = 0; i < numbers.length; i++)
//        {
//            if (map.containsKey(target - numbers[i]))
//            {
//                System.out.printf("Pair found (%d, %d)", numbers[map.get(target - numbers[i])], numbers[i]);
//                return;
//            }
// 
//            map.put(numbers[i], i);
//        }
// 
//        System.out.println("Pair not found");
//    }

}
