
public class BogoSort {

    public static void sort(int[] array) {
        if (array.length < 2) return;

        while (!isSorted(array)) {
            for (int i=0; i<array.length; i++) {
                int indexTmp = (int) (Math.random()*(array.length-1));
                int elementTmp = array[i];
                array[i] = array[indexTmp];
                array[indexTmp] = elementTmp;
            }
        }
    }

    private static boolean isSorted(int[] array) {
        for (int i=0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) return false;
        }
        return true;
    }
}
