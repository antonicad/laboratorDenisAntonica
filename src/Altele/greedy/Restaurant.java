package greedy;
public class Restaurant {

    public static void main(String[] args) {
        int[] timpi= {10, 20, 10, 20};
        // Apelează funcția getMin pentru a calcula timpul total și a afișa ordinea de preparare
        int timpTotal = getMin(timpi);
        System.out.println("Timpul total de asteptare este: " + timpTotal);
    }

    // Calculează timpul total de așteptare minimizat și returnează acest timp
    static int getMin(int[] timpi) {
        sort(timpi); // Sortează timpii de preparare în ordine crescătoare

        int timpTotal = 0;
        int timpAsteptareCurent = 0;

        // Calculează timpul total de așteptare
        for(int i = 0; i < timpi.length; i++) {
            timpAsteptareCurent += timpi[i]; // Adaugă timpul de preparare curent la total
            timpTotal += timpAsteptareCurent; // Adaugă timpul de așteptare curent la timpul total de așteptare
        }

        return timpTotal; // Returnează timpul total de așteptare
    }

    // Funcția de sortare Bubble Sort, care ordonează elementele array-ului în ordine crescătoare
    static void sort(int[] elemente) {
        boolean swap;
        for(int i = 0; i < elemente.length; i++) {
            swap = false;
            for(int j = 0; j < elemente.length - i - 1; j++) {
                if(elemente[j + 1] < elemente[j]) {
                    int temp = elemente[j];
                    elemente[j] = elemente[j + 1];
                    elemente[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break; // Dacă nu a fost făcut niciun swap, array-ul este sortat
        }
    }
}
