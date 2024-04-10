package Altele;

public class MergeSort {
    public static void main(String[] args){
        int[] sir = {2,3,4,1,6,7};
        mergeSort(sir, 0, sir.length-1);

        for(int i = 0; i<sir.length; i++)
            System.out.print(sir[i]);
    }

    public static void mergeSort(int[] sir, int indexStanga, int indexDreapta) {
        if (indexStanga < indexDreapta) {
            int indexMijloc = indexStanga + (indexDreapta - indexStanga) / 2;
            mergeSort(sir, indexStanga, indexMijloc);
            mergeSort(sir, indexMijloc + 1, indexDreapta);

            int i, j, k;
            int lungimeStanga = indexMijloc - indexStanga + 1;
            int lungimeDreapta = indexDreapta - indexMijloc;
            int[] Stanga = new int[lungimeStanga];
            int[] Dreapta = new int[lungimeDreapta];
            for (i = 0; i < lungimeStanga; i++)
                Stanga[i] = sir[indexStanga + i];
            for (j = 0; j < lungimeDreapta; j++)
                Dreapta[j] = sir[indexMijloc + 1 + j];
            i = 0;
            j = 0;
            k = indexStanga;
            while (i < lungimeStanga && j < lungimeDreapta) {
                if (Stanga[i] <= Dreapta[j])
                    sir[k++] = Stanga[i++];
                else
                    sir[k++] = Dreapta[j++];
            }
            while (i < lungimeStanga)
                sir[k++] = Stanga[i++];
            while (j < lungimeDreapta)
                sir[k++] = Dreapta[j++];
        }
    }
}
