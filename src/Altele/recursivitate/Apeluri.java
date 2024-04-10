package recursivitate;

public class Apeluri {
    public static void main(String[] args) {
        scrieVertical(1234);
    }
    public static void scrieVertical (int numar)
    {
        if( numar < 10 )
            System.out.println (numar);
        else
        {
            scrieVertical (numar / 10);
            System.out.println (numar % 10);
        }
    }

}
