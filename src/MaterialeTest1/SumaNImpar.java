package MaterialeTest1;

public class SumaNImpar {
    public static void main(String[] args){
        int N = 20;
        System.out.println(sumaNImp(N));
    }

    public static int sumaNImp(int n) {
        if (n <= 1) {
            return 1;
        } else {
            if (n % 2 == 0) {
                n--;
            }
            int suma = n + sumaNImp(n - 2);
            return suma;
        }

    }
}
