/**
 * Created by Yezhov Sergey on 06.11.2014.
 *
 * Task 11.158: remove repeating elements from array
 *
 */

public class Task_11_158 {
    public static void main(String[] args) {

        // Input array
        int[] ar = {1, 2, 3, 888, 5, 888, 7, 888, 555, 10, 888, 12, 555, 14, 888, 888, 888};


        // code
        boolean[] arBoo = new boolean[ar.length]; // array for positions of repeating elements
        int k = 0; // counter for repeating elements

        for (int i = 0; i < ar.length; i++) {
            // if element is repeating - skip
            if (arBoo[i]) {
                continue;
            }
            for (int j = i + 1; j < ar.length; j++) {

                if (ar[i] == (ar[j])) {
                    k++;
                    arBoo[j] = true; // fix the position of repeating element
                }
            }
        }


        int[] arNew = new int[ar.length - k]; // new array without repeating elements
        int skip = 0; // auxiliary counter for new array index

        for (int i = 0; i < ar.length; i++) {
            if (arBoo[i]) {
                skip++;
                continue;
            }
            arNew[i-skip] = ar[i];
        }

        for (int i : arNew) {
            System.out.print(i + " ");
        }

    }
}
