/**
 * Created by Yezhov Sergey on 07.11.2014.
 *
 */
public class Task_12_234 {
    public static void main(String[] args) {
        int[][] ar = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}
        };


        // Input data
        final int k=2; // row to remove
        final int s=7; // column to remove


        if ( (k >= 1 && k <= ar.length) && (s >= 1 && s <= ar[0].length)  ) {

            // a) remove k-th row

            int[][] arK = new int [ar.length - 1][];
            int skipK = 0;

            for (int i = 0; i <= (ar.length - 1); i++) {
                if (i == k-1) {
                    skipK++;
                    continue;
                }
                arK[i-skipK] = new int[ar[i].length];
                for (int j = 0; j <= (ar[i].length - 1); j++) {
                    arK[i-skipK][j] = ar[i][j];
                }
            }

            System.out.println("a) Remove row " + k);
            for (int[] a: arK) {
                for (int i: a) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }




            // b) remove s-th column

            int[][] arS = new int [ar.length][];


            for (int i = 0; i <= (ar.length - 1); i++) {
                int skipS = 0;

                arS[i-skipS] = new int[ar[i].length - 1];
                for (int j = 0; j <= (ar[i].length - 1); j++) {

                    if (j == s-1) {
                        skipS++;
                        continue;
                    }

                    arS[i][j-skipS] = ar[i][j];
                }
            }


            System.out.println("\nb) Remove column " + s);
            for (int[] a: arS) {
                for (int i: a) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }


        }
        else {
            System.out.println("*** Incorrect input data! ***");
        }
    }
}
