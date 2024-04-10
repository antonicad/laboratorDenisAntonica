package Altele;

public class Cautari {
    // cautare liniara in sir ordonat
/*    public static int cautareLiniaraInOrdonat(int[] v, int cheie) {
        int dimensiune = v.length;
        int i = 0;
        while (i < dimensiune && v[i] <= cheie) {
            i++;
        }
        if (i == 0 || v[i - 1] != cheie) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public static void main(String[] args) {
        int[] valori = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int valoareCautata = 35;
        System.out.println("Valoarea " + valoareCautata + " se găsește la poziția " + cautareLiniaraInOrdonat(valori, valoareCautata));
    }*/
/*
// CAUTAREA BINARA
    public static void main(String[] args) {
        System.out.println("Cautare binara");
        int[] valori= {10,20,30,40,50,60,70,80,90};
        int valCautata = 80;
        System.out.println("Valoarea " + valCautata + " se gaseste la pozitia " + binarySearch(valori, valCautata));
    }

    public static int binarySearch(int[] a, int cheie) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mijloc = (start + end) / 2;
            if (cheie == a[mijloc]) {
                return mijloc;
            }
            if (cheie < a[mijloc]) {
                end = mijloc - 1;
            } else {
                start = mijloc + 1;
            }
        }
        return -1;
    }*/

// CAUTAREA BINARA RECURSIVA
    public static int recursiveBinarySearch(int[] a, int start, int end, int cheie) {
        if (start < end) {
            int mijloc = start + (end - start) / 2;
            if (cheie < a[mijloc]) {
                return recursiveBinarySearch(a, start, mijloc, cheie);
            } else if (cheie > a[mijloc]) {
                return recursiveBinarySearch(a, mijloc+1, end , cheie);
            } else {
                return mijloc;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Cautare binara recursiva");
        int[] valori= {10,20,30,40,50,60,70,80,90};
        int valCautata = 30;
        System.out.println("Valoarea " + valCautata + " se gaseste la pozitia " + recursiveBinarySearch(valori,0,valori.length,valCautata));
    }
}
