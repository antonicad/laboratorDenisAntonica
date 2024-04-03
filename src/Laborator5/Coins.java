package Laborator5;
public class Coins {
    static int solution[], coinValues[], maxCoins[];
    static int sum;

    public static void main(String[] args) {
        coinValues = new int[3];
        coinValues[0] = 1;
        coinValues[1] = 2;
        coinValues[2] = 5;

        maxCoins = new int[3];
        maxCoins[0] = 5;
        maxCoins[1] = 5;
        maxCoins[2] = 5;

        sum = 10;
        solution = new int[coinValues.length];

        countCoins(0);
    }

    public static void countCoins(int k) {
        int i;
        for (i = 0; i <= maxCoins[k]; i++) {
            solution[k] = i;
            if (isValid(k) == true) {
                if (isSolution(k) == true) {
                    printSolution(k);
                } else if (k < coinValues.length - 1) {
                    countCoins(k + 1);
                }
            }
        }
    }

    public static void printSolution(int k)
    {
        System.out.println("");
        for (int i = 0; i <= k; i++) {
            System.out.print("" + solution[i] + " coins with value of " + coinValues[i] + ", ");
        }
        System.out.print(" total " + sum);
    }

    public static boolean isValid(int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum = currentSum + solution[i] * coinValues[i];
        }

        if (currentSum <= sum && k < coinValues.length) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isSolution(int k) {
        int currentSum = 0;
        for (int i = 0; i <= k; i++) {
            currentSum = currentSum + solution[i] * coinValues[i];
        }

        if (currentSum == sum) {
            return true;
        } else {
            return false;
        }
    }

}

