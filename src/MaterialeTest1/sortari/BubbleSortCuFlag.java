package sortari;

public class BubbleSortCuFlag {
    public static void main(String[] args){
        int[] v={2,-2,8,90,56};
        sortareBubble_1(v);
        for(int i=0;i<v.length-1;i++)
            System.out.print(v[i]+", ");
        System.out.print(v[v.length-1]);
    }
    static void sortareBubble_1(int [] v)
    {
        boolean ordonat=false;
        while(!ordonat)
        {
            ordonat=true;  //presupunem ca sirul este ordonat
            for(int i=1;i<v.length;i++)
            {
                if(v[i]<v[i-1])
                {
                    //avem inversiune
                    //si interschimbam
                    int aux;
                    aux = v[i-1];
                    v[i-1]=v[i];
                    v[i]=aux;
                    ordonat=false;
                }
            }
        }
    }

}
