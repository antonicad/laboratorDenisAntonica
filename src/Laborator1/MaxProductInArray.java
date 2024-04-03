package Laborator1;

import java.util.Arrays;

public class MaxProductInArray {
    public static void main (String[] args)
    {
        int[] array = { -10, -3, 5, 6, -2 };
 
        findMaxProduct(array);
    }
	
	
//    public static void findMaxProduct(int[] array)
//    {
//        if (array.length < 2) {
//            return;
//        }
// 
//        int maxProduct = -1;
//        int maxI = -1, maxJ = -1;
// 
//        for (int i = 0; i < array.length - 1; i++)
//        {
//            for (int j = i + 1; j < array.length; j++)
//            {
//                if (maxProduct < array[i] * array[j])
//                {
//                	maxProduct = array[i] * array[j];
//                	maxI = i;
//                	maxJ = j;
//                }
//            }
//        }
// 
//        System.out.print("Pair is (" + array[maxI] + ", " + array[maxJ] + ")");
//    }
    
//    public static void findMaxProduct(int[] array)
//    {
//        int n = array.length;
// 
//        if (n < 2) {
//            return;
//        }
// 
//        Arrays.sort(array);
// 
// 
//        if ((array[0] * array[1]) > (array[n - 1] * array[n - 2])) {
//            System.out.print("Pair is (" + array[0] + ',' + array[1] + ')');
//        }
//        else {
//            System.out.print("Pair is (" + array[n - 1] + ',' + array[n - 2] + ')');
//        }
//    }
    
    public static void findMaxProduct(int[] array)
    {
        int max1 = array[0], max2 = Integer.MIN_VALUE;
        int min1 = array[0], min2 = Integer.MAX_VALUE;
 
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max1)
            {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }
 
            if (array[i] < min1)
            {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2) {
                min2 = array[i];
            }

        }
 
        if (max1 * max2 > min1 * min2) {
            System.out.print("Pair is (" + max1 + ", " + max2 + ")");
        }
        else {
            System.out.print("Pair is (" + min1 + ", " + min2 + ")");
        }
    }
}
