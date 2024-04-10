package recursivitate;

public class Factorial {
    public static void main(String[] args){
        System.out.println(factorialN(3));
    }
    public static int factorialN(int n)
    {
        if (n==0)
            return 1;
        if (n==1)
            return 1;
        return n*factorialN(n-1);
    }
}
