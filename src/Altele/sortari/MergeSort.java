package sortari;

public class MergeSort {
    public static void main(String[] args) {
        // Definim un array de numere întregi
        int[] v = {8, -2, 70, 6, 0, -4, 9};
        // Apelăm funcția mergeSort pentru a sorta array-ul
        mergeSort(v, 0, v.length - 1);
        // Afișăm array-ul sortat
        for (int i = 0; i < v.length - 1; i++)
            System.out.print(v[i] + ", ");
        System.out.print(v[v.length - 1]);
    }

    // Funcția pentru combinarea a două sub-array-uri sortate într-unul singur
    static void merge(int[] v, int s, int mijl, int d) {
        // Calculăm dimensiunile celor două sub-array-uri
        int n1 = (mijl - s) + 1;
        int n2 = d - mijl;

        // Creăm sub-array-urile temporare
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiem datele în sub-array-uri
        for (int i = 0; i < n1; i++)
            L[i] = v[s + i];
        for (int j = 0; j < n2; j++)
            R[j] = v[mijl + 1 + j];

        // Inițializăm indicii de parcurgere ai sub-array-urilor și al array-ului principal
        int i = 0, j = 0;
        int k = s;

        // Combinăm sub-array-urile înapoi în array-ul principal
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                v[k] = L[i];
                i++;
            } else {
                v[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiem elementele rămase din L, dacă există
        while (i < n1) {
            v[k] = L[i];
            i++;
            k++;
        }

        // Copiem elementele rămase din R, dacă există
        while (j < n2) {
            v[k] = R[j];
            j++;
            k++;
        }
    }

    // Funcția principală care implementează MergeSort
    static void mergeSort(int[] v, int s, int d) {
        if (s < d) {
            // Găsim mijlocul pentru a împărți array-ul în două jumătăți
            int m = (s + d) / 2;

            // Sortăm prima și a doua jumătate
            mergeSort(v, s, m);
            mergeSort(v, m + 1, d);

            // Combinăm jumătățile sortate
            merge(v, s, m, d);
        }
    }
}
