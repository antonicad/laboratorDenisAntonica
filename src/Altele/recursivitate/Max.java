package recursivitate;

public class Max {
    public static void main(String[] args){
        int[] v={7,17,-2,8,9,10,2};
        System.out.println(maxRec(v,0,(v.length-1)));
    }

    public static int maxRec(int[] v, int start, int end) {
        // caz de baza: vectorul are un singur element
        if (start == end) {
            return v[start];
        } else {
            // declaram mid ca fiind pozitia elementului din mijlocul vectorului
            int mid = start + (end - start) / 2;
            // apel recursiv pentru a afla valoarea maxima a partii din stanga a vectorului
            int maxLeft = maxRec(v, start, mid);
            // apel recursiv pentru a afla valoarea maxima a partii din stanga a vectorului
            int maxRight = maxRec(v, mid + 1, end);
            // returnam valoarea cea mai mare
            return Math.max(maxLeft, maxRight);
        }
    }
}
