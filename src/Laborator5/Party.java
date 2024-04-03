package Laborator5;
public class Party {
    public static int[][] people;
    public static int solution[];

    public static void main(String[] args) {
        people = new int[5][5];
        people[0][0] = 0;
        people[0][1] = 1;
        people[0][2] = 0;
        people[0][3] = 1;
        people[0][4] = 0;

        people[1][0] = 1;
        people[1][1] = 0;
        people[1][2] = 1;
        people[1][3] = 0;
        people[1][4] = 1;

        people[2][0] = 0;
        people[2][1] = 1;
        people[2][2] = 0;
        people[2][3] = 0;
        people[2][4] = 1;

        people[3][0] = 1;
        people[3][1] = 1;
        people[3][2] = 1;
        people[3][3] = 0;
        people[3][4] = 1;

        people[4][0] = 0;
        people[4][1] = 0;
        people[4][2] = 1;
        people[4][3] = 1;
        people[4][4] = 0;

        solution = new int[people[0].length];

        arrangeParty(0);
        System.out.println();

    }

    public static boolean isValid(int k) //
    {
        // 1: all people at the table should be different from the current person
        for (int i = 0; i < k; i++) {
            if (solution[i] == solution[k]) {
                return false;
            }
        }

        // 2: current person should "like" the previous one
        for (int i = 0; i < k - 1; i++) {
            if (people[solution[i]][solution[i + 1]] == 0) {
                return false;
            }
        }

        // 3: last person should "like" the first one
        if (k == people[0].length - 1 && people[solution[0]][solution[k]] == 0) {
            return false;
        }

        return true;
    }

    static void arrangeParty(int k) {
        int i;

        for (i = 0; i < people[0].length; i++) {

            solution[k] = i;

            if (isValid(k)) {
                if (isSolution(k)) {
                    printOrder();
                } else {
                    arrangeParty(k + 1);
                }
            }
        }
    }

    public static boolean isSolution(int k) {
        if (k == people[0].length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void printOrder() {
        System.out.println();
        System.out.print("Solution: ");
        for (int i = 0; i < solution.length; i++) {
            System.out.print("" + solution[i] + "  ");
        }
    }
}
