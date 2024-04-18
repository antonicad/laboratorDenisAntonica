package sortari;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // Inițializăm un array de numere întregi pentru sortare
        int[] v = {0, 77, -5, -4, -3, 0, 2, 100};
        // Apelăm metoda sort pentru a sorta array-ul
        sort(v, 0, v.length - 1);
        // Afișăm array-ul sortat
        System.out.println(Arrays.toString(v));
    }

    // Funcția partition returnează indicele pivotului după ce a aranjat elementele mai mici la stânga pivotului și pe cele mai mari la dreapta
    static int partition(int[] v, int stg, int dr) {
        // Alegem elementul din dreapta ca pivot
        int pivot = v[dr];
        // i indică diviziunea dintre elementele mai mici decât pivot și cele mai mari
        int i = stg - 1;
        for (int j = stg; j < dr; j++) {
            // Dacă elementul curent este mai mic decât pivotul, îl schimbăm să fie în partea stângă a pivotului
            if (v[j] < pivot) {
                i++;
                // Schimbăm elementele v[j] și v[i]
                int temp = v[j];
                v[j] = v[i];
                v[i] = temp;
            }
        }
        // Schimbăm pivotul cu elementul de la indicele i+1, astfel încât pivotul să fie la locul său final
        int temp = v[dr];
        v[dr] = v[i + 1];
        v[i + 1] = temp;
        // Returnăm poziția pivotului
        return i + 1;
    }

    // Metoda sort care implementează algoritmul QuickSort
    static void sort(int[] v, int stg, int dr) {
        if (stg < dr) {
            // Partitionăm array-ul
            int partition = partition(v, stg, dr);
            // Aplicăm QuickSort pe sub-array-ul din stânga pivotului
            sort(v, stg, partition - 1);
            // Aplicăm QuickSort pe sub-array-ul din dreapta pivotului
            sort(v, partition + 1, dr);
        }
    }
}
