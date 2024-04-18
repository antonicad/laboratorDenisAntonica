package MaterialeTest1;

public class Recursive {
    public static void main(String[] args) {
        System.out.println("Never gonna give you up, never gonna let you down.");
        int n = 3;

        System.out.println("Suma N: " + sumaN(n));
        System.out.println("N factorial: " + nFactorial(n));
        System.out.println("Fibonacci N: " + fibo(n));
        System.out.println("Turnurile din Hanoi:");
        runHanoi(7, 'A', 'B', 'C');
    }

    // SUMA DE LA 1 LA N
    public static int sumaN(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return n+sumaN(n-1);
    }

    // N FACTORIAL
    public static int nFactorial(int n) {
        if (n==0 || n==1)
            return 1;
        return n*nFactorial(n-1);
    }

    // SIRUL FIBONACCI
    public static int fibo(int n) {
        if (n==0 || n==1)
            return 1;
        return fibo(n-1) + fibo(n-2);
    }

    // HANOI
    public static void runHanoi(int n, char sursa, char auxiliar, char destinatie)
    {
        if (n > 0) {
            runHanoi(n - 1, sursa, auxiliar, destinatie);
            System.out.println("Muta discul. " + n + " de la " + sursa + " la " + destinatie);
            runHanoi(n - 1, auxiliar, destinatie, sursa);
        }
    }

}
