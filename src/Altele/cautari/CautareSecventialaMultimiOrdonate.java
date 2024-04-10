package cautari;

public class CautareSecventialaMultimiOrdonate {
    public static void main(String[] args){
    int[] v = {2, 4, 5, 6, 9, 10};
    System.out.println(linearSearchInSorted(v,5));
}
    public static int linearSearchInSorted(int[] v, int cheie)
    {
        int size = v.length;
        int i=0;
        //mergem "in dreapta" pana cand "cheie" este
        //mai mica decat valoarea curenta din colectie
        while (i<size && v[i]<=cheie)
        {
            i++;
        }
        //verificam daca s-a gasit cheia de cautare in colectie
        if(i==0 || v[i-1]!=cheie)
            return -1;
        else
            return i-1;
    }

}
