package Laborator6;


import java.lang.*;

public class MaxSubarrays {
    public static void main(String[] args)
    {
        int[] arr = {2, 8, 3, 4, 7};
        int result = findMax(arr);
        System.out.println(result);
    }

    private static int findMax(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]*arr[i+1]);
        }

        return max;
    }
}

