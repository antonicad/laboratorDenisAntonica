package Laborator6;

public class Backpack {
    public static void main(String[] args)
    {
        int[] weights = {12, 2, 1, 4, 1};
        int[] values = {6, 2, 1, 10, 2};
        int capacity = 15;

        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println(maxValue);
    }


    public static double getMaxValue(int[] weights, int[] values, int capacity)
    {
        GoldBar[] goldbars = new GoldBar[weights.length];

        for (int i = 0; i < weights.length; i++) {
            goldbars[i] = new GoldBar(weights[i], values[i]);
        }

        sort(goldbars);

        double maxValue = 0;

        for (GoldBar goldbar: goldbars) {
            if (capacity - goldbar.weight > 0) {
                capacity -= goldbar.weight;
                maxValue += goldbar.value;
            } else {
                maxValue += (double)capacity / (double)goldbar.weight * (double)goldbar.value;
                break;
            }
        }

        return maxValue;
    }

    private static void sort(GoldBar[] elements) {
        int n = elements.length;
        boolean swap;
        for (int i = 0; i < n; i++) {
            swap = false;
            for (int j = 0; j < n-i-1; j++) {
                if(elements[j+1].profitForKg > elements[j].profitForKg ) {
                    GoldBar temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    static class GoldBar
    {
        double profitForKg;
        double weight, value;

        public GoldBar(int weight, int value)
        {
            this.weight = weight;
            this.value = value;
            this.profitForKg = (double) value/weight;
        }
    }
}
