package Altele;
import java.util.Arrays;
public class MergeSortGPT {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 10, 6, 7, -2};
        System.out.println("Lista initiala: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Lista sortata: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int stanga, int dreapta) {
        if (stanga < dreapta) {
            int mijloc = (stanga + dreapta) / 2;

            // Sortăm jumătatea stângă a listei
            mergeSort(arr, stanga, mijloc);

            // Sortăm jumătatea dreaptă a listei
            mergeSort(arr, mijloc + 1, dreapta);

            // Fuzionăm cele două jumătăți sortate
            merge(arr, stanga, mijloc, dreapta);
        }
    }

    public static void merge(int[] arr, int stanga, int mijloc, int dreapta) {
        int n1 = mijloc - stanga + 1;
        int n2 = dreapta - mijloc;

        int[] stangaArr = new int[n1];
        int[] dreaptaArr = new int[n2];

        // Copiem elementele în array-urile temporare
        for (int i = 0; i < n1; ++i)
            stangaArr[i] = arr[stanga + i];
        for (int j = 0; j < n2; ++j)
            dreaptaArr[j] = arr[mijloc + 1 + j];

        // Indexii inițiali ai celor două sub-array-uri
        int i = 0, j = 0;

        // Indexul inițial al array-ului fuzionat
        int k = stanga;

        // Fuzionăm cele două sub-array-uri într-unul singur
        while (i < n1 && j < n2) {
            if (stangaArr[i] <= dreaptaArr[j]) {
                arr[k] = stangaArr[i];
                i++;
            } else {
                arr[k] = dreaptaArr[j];
                j++;
            }
            k++;
        }

        // Copiem elementele rămase din array-urile temporare, dacă există
        while (i < n1) {
            arr[k] = stangaArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = dreaptaArr[j];
            j++;
            k++;
        }
    }
}
