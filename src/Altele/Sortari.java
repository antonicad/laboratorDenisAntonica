package Altele;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Sortari {
    // Sortari Bubble Sort (sortarea prin metoda bulelor)
    // Insert Sort (sortarea prin insertie)
    // Select Sort (sortarea prin selectie)
    // Merge Sort (sortarea prin interclasare)
    // QuickSort (sortarea rapida)

    public static void printElements(int [] vector) {
        for(int i = 0; i<vector.length; i++)
            System.out.println(vector[i]);
    }


    public static void main(String[] args){
        // Sortari Bubble Sort (sortarea prin metoda bulelor)
        int [] vectorBubble = {1, 8, 2, 9, 3};
        boolean ordonat = true;
        while (ordonat)
        {
            ordonat = false;
            for(int i=1; i<vectorBubble.length; i++)
            {
                if (vectorBubble[i] < vectorBubble[i-1])
                {
                    int auxiliar;
                    auxiliar = vectorBubble[i-1];
                    vectorBubble[i-1] = vectorBubble[i];
                    vectorBubble[i] = auxiliar;
                    ordonat = true;
                }
            }
        }
        // printElements(vectorBubble);


        // Insert Sort (sortarea prin insertie)
        int [] vectorInsert = {1, 8, 2, 9, 3};
        for (int i = 1; i < vectorInsert.length; i++) {
            int elementCurent = vectorInsert[i];
            int currentIndex = i - 1;
            while (currentIndex >= 0 && elementCurent < vectorInsert[currentIndex]) {
                vectorInsert[currentIndex + 1] = vectorInsert[currentIndex];
                currentIndex--;
            }
            vectorInsert[currentIndex + 1] = elementCurent;
        }
        // printElements(vectorInsert);


        // Select Sort (sortarea prin selectie)
        int [] vectorSelect = {1, 8, 2, 9, 3};
        for (int i = 0; i < vectorSelect.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < vectorSelect.length; j++) {
                if (vectorSelect[j] < vectorSelect[minPosition])
                    minPosition = j;
            }
            if (minPosition != i) {
                    int temp = vectorSelect[i];
                    vectorSelect[i] = vectorSelect[minPosition];
                    vectorSelect[minPosition] = temp;
            }
        }
        // printElements(vectorSelect);

        int vectorQuick[] = {42, 8, 4, 16, 23, 15};
        quickSort(vectorQuick, 0, vectorQuick.length-1);

    }


    private static void quickSort(int[] vector, int stanga, int dreapta) {
        if (stanga < dreapta) {

            int partitionIndex = partition(vector, stanga, dreapta);
            quickSort(vector, stanga, partitionIndex - 1);
            quickSort(vector, partitionIndex + 1, dreapta);
        }
    }

    private static int partition(int arr[], int stanga, int dreapta) {

        int pivot = arr[dreapta];
        int i = stanga - 1;
        for (int j = stanga; j < dreapta; j++) {

            if (arr[j] <= pivot) {
                i++;
                //swap(arr, j, i);
            }
        }

        //swap(arr, dreapta, i+1);
        return i + 1;
    }
}
