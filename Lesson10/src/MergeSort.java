public class MergeSort {

    public static void sort(int[] array) {
        if (array.length < 2) return;

        sort(array, 0, array.length - 1);
    }

    // *** private methods ***
    private static void sort(int[] array, int startIndex, int stopIndex) {
        if (startIndex == stopIndex) {
            return;
        }

        // sort the first half
        sort(array, startIndex, startIndex + (stopIndex - startIndex) / 2);

        // sort the second half
        sort(array, startIndex + (stopIndex - startIndex) / 2 + 1, stopIndex);

        // *** start sorting
        int firstCounter = startIndex;
        int secondCounter = startIndex + (stopIndex - startIndex) / 2 + 1;
        int[] arrayTmp = new int[stopIndex + 1];
        int iTmp = 0;

        while (firstCounter <= (startIndex + (stopIndex - startIndex) / 2) && secondCounter <= stopIndex) {
            if (array[firstCounter] <= array[secondCounter]) {
                arrayTmp[iTmp++] = array[firstCounter++];
            } else {
                arrayTmp[iTmp++] = array[secondCounter++];
            }
        }

        while (true) {
            if (firstCounter <= (startIndex + (stopIndex - startIndex) / 2)) {
                arrayTmp[iTmp++] = array[firstCounter++];
                continue;
            } else if (secondCounter <= stopIndex) {
                arrayTmp[iTmp++] = array[secondCounter++];
                continue;
            }
            break;
        }

        for (int n = 0, i = startIndex; i <= stopIndex; i++, n++) {
            array[i] = arrayTmp[n];
        }
        // ***** end soring

    }
}
