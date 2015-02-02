
public class QuickSort {

    public static void sort(int[] array) {
        if (array.length < 2) return;

        sort(array, 0, array.length - 1);
    }


    // ***** private methods *****

    private static void sort(int[] a, int iStart, int iStop) {
        // if one element
        if (iStart == iStop) return;

        // if two elements
        if (iStart + 1 == iStop) {
            if (a[iStart] > a[iStop]) {
                swap(a, iStart, iStop);
            }
            return;
        }

        // start sort
        int i = iStart + 1;
        int j = iStop;

        while (true) { //#dbg j >= i
            // searching for 2 elements in array to swap
            while (j >= i && a[iStart] > a[i]) {
                i++;
            }
            while (j >= i && a[iStart] <= a[j]) {
                j--;
            }
            if (j < i) break; // exit from loop
            swap(a, i, j);
        }

        // swap reference element (iStart) to the "center"
        if (a[iStart] > a[j]) {
             swap(a, iStart, j);
        }

        // sort a left half
        sort(a, iStart, j);

        // sort a right half
        if (j < a.length - 1) sort(a, j+1, iStop);
    }

    private static void swap(int[] a, int iFrom, int iTo) {
        if (iFrom == iTo) return;
        int tmp = a[iTo];
        a[iTo] = a[iFrom];
        a[iFrom] = tmp;
    }
}
