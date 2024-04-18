package recursivitate;

public class Suma {
    public static void main(String[] args){
        System.out.println(sumaN(4));
    }
    public static int sumaN(int n)
    {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return n+sumaN(n-1);
    }
}
