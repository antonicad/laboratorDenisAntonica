package cautari;

public class DivideEtImperaSecventialMultimiOrdonate {

    public static void main(String[] args){
        int[] v = {2, 4, 5, 6, 9, 10};
        System.out.println(cautareDivideSecventiala(v,5));
    }
    static int cautareDivideSecventiala(int[] v,int e){
        int stg=0;
        int dr=v.length-1;
        while(stg<=dr){
            int mid=(stg+dr)/2;
            if(v[mid]==e)
                return mid;
            if(v[mid]>e)
                dr=mid;
            else stg=mid+1;
        }
        return -1;
    }
}
