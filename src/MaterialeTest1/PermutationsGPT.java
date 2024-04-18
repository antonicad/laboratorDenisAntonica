package MaterialeTest1;
import java.util.Arrays;

public class PermutationsGPT {
    public static void permute(int [] data, int i, int length) {
        if (i == length) {
            System.out.println(Arrays.toString(data));
        } else {
            for (int j = i; j < length; j++) {
                // Schimbarea elementelor
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                // Apel recursiv pentru generarea permutărilor restului listei
                permute(data, i + 1, length);
                // Revenirea la starea originală pentru a continua generarea
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
    }

    // Metoda main pentru testare
    public static void main(String[] args) {
        int [] data = {1,2,3,4,5};
        permute(data, 0, data.length);
    }
}
