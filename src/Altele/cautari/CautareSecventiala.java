package cautari;

public class CautareSecventiala {
    public static void main(String[] args){
        int[] v={2,-20,8,7,20};
        System.out.println(linearSearch(v,2));
    }

    public static int linearSearch(int[] v, int cheie){
        //cautarea secventiala (liniara)
        int size = v.length;
        for(int i=0;i<size;i++){
            if(v[i] == cheie){
                //daca s-a gasit valoarea cautata
                //se returneaza pozitia curenta
                return i;
            }
        }
        //daca nu s-a gasit valoarea cautata
        //se returneaza indexul -1
        return -1;
    }

}
