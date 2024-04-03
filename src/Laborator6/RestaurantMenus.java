package Laborator6;

import java.util.Arrays;

import Laborator3.MergeSort;

public class RestaurantMenus {
    public static void main(String[] args) {
        int[] waitTimes = {25, 30, 15, 40, 35, 20, 30, 20};

        double meanWaitTime = getMeanWaitTime(waitTimes);
        System.out.println(meanWaitTime);
    }

    private static double getMeanWaitTime(int[] waitTimes) {
        MergeSort.mergeSort(waitTimes, 0, waitTimes.length-1);

        System.out.println(Arrays.toString(waitTimes));

        int totalWaitTime = 0;
        for (int i = 0; i < waitTimes.length; i++) {
            for (int j = 0; j < i; j++) {
                totalWaitTime += waitTimes[j];
            }
        }

        return (double)totalWaitTime / (double)waitTimes.length;
    }
}


