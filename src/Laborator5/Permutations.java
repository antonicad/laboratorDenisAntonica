package Laborator5;

public class Permutations {
    static int[] arr;
    static int[] solution;
    static int n;

    public static void main(String[] args) {
        n = 4;
        arr = new int[]{1, 2, 4, 5};
        solution = new int[n]; // {0, 0, 0,0}

        permutations(0);
    }

    static void permutations(int k)
    {
        int i;
        for(i=0;i<n;i++){
            solution[k]=arr[i];
            if(isValid(k)) {
                if(isSolution(k))
                    print();
                else
                    permutations(k+1);
            }
        }
    }

    static void print()
    {
        System.out.println();
        for(int i=0;i<solution.length;i++)
            System.out.print(" " + solution[i]);
    }

    static boolean isSolution(int k)
    {
        if(k==n-1)
            return true;
        else
            return false;
    }

    static boolean isValid(int k)
    {
        for(int i=0;i<k;i++)
            if(solution[i]==solution[k])
                return false;
        return true;
    }

}


