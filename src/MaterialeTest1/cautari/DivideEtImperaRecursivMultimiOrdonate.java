package cautari;

public class DivideEtImperaRecursivMultimiOrdonate {
    public static void main(String[] args){
        int[] v = {2, 4, 5, 6, 9, 10};
        System.out.println(divideRecursiv(v,5,0,v.length-1));
    }
    static int divideRecursiv(int[] v, int e, int stg,int dr){
        while(stg<=dr){
            int mid=(stg+dr)/2;
            if(v[mid]==e)
                return mid;
            if(v[mid]>e)
                return divideRecursiv(v, e,stg,mid-1);
            else return divideRecursiv(v,e,mid+1,dr);
        }
        return -1;
    }
}
