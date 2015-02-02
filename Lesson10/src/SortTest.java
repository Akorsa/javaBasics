import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

public class SortTest {

//    private int[] testArray = rndArray(50000);

//    @Test
//    public void bubbleTest() {
//
//        int[] ar = new int[testArray.length];
//        System.arraycopy(testArray, 0, ar, 0, testArray.length);
//
//        Date start = new Date();
//        BubbleSort.sort(ar);
//        Date stop = new Date();
//
//        System.out.println("BubbleSort execution time: " + (stop.getTime() - start.getTime()) + " ms");
//
//        Assert.assertEquals("Array is sorted", true, isSorted(ar));
//    }
//
//
//    @Test
//    public void quickTest() {
//        int[] ar = new int[testArray.length];
//        System.arraycopy(testArray, 0, ar, 0, testArray.length);
//
////        int[] ar = {16, 4, 19, 13, 18, 16, 17, 2, 10, 1, 9, 0, 14, 17, 16, 8, 18, 15, 8, 1};
////        int[] ar = {3, 0, 37, 22, 22, 17, 2, 21, 22, 42, 21, 28, 13, 27, 15, 21, 7, 39, 19, 19, 18, 14, 0,
////        39, 5, 19, 20, 2, 30, 9, 15, 11, 28, 45, 8, 9, 42, 16, 32, 41, 1, 49, 8, 33, 15, 5, 7, 9, 38, 47};
////        int[] ar = {5, 0, 11, 4, 6, 5, 10, 5, 19, 3, 10, 12, 1, 19, 6, 2, 1, 16, 18, 17};
//
////        int[] ar = new int[10000];
////        for (int i = ar.length-1; i>=0; i--) {
////            ar[i] = i;
////        }
//
//        Date start = new Date();
//        QuickSort.sort(ar);
//        Date stop = new Date();
//
//        System.out.println("QuickSort execution time: " + (stop.getTime() - start.getTime()) + " ms");
//
//        Assert.assertEquals("Array is sorted", true, isSorted(ar));
//    }
//
//
//    @Test
//    public void mergeTest() {
//        int[] ar = new int[testArray.length];
//        System.arraycopy(testArray, 0, ar, 0, testArray.length);
//
//        Date start = new Date();
//        MergeSort.sort(ar);
//        Date stop = new Date();
//
//        System.out.println("MergeSort execution time: " + (stop.getTime() - start.getTime()) + " ms");
//
//        Assert.assertEquals("Array is sorted", true, isSorted(ar));
//    }
//
//
//    @Test
//    public void bogoTest() {
//        int[] ar = rndArray(10);
//
//        Date start = new Date();
//        BogoSort.sort(ar);
//        Date stop = new Date();
//
//        System.out.println("BogoSort execution time: " + (stop.getTime() - start.getTime()) + " ms");
//
//        Assert.assertEquals("Array is sorted", true, isSorted(ar));
//    }
//

    @Test
    public void zeroElementArrayTest() {
        int[] ar = new int[0];

        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "bubble", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "merge", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "quick", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "bogo", false)));
    }

    @Test
    public void oneElementArrayTest() {
        int[] ar = {1};

        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "bubble", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "merge", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "quick", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "bogo", false)));
    }

    @Test
    public void twoElementsArrayTest() {
        int[] ar = {1, 2};
        int[] checkAr = {1, 2};

        Assert.assertEquals("The same array", true, Arrays.equals(checkAr, sortTest(ar, "bubble", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(checkAr, sortTest(ar, "merge", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(checkAr, sortTest(ar, "quick", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(checkAr, sortTest(ar, "bogo", false)));

        ar[0] = 2;
        ar[1] = 1;

        Assert.assertEquals("Sorted array", true, Arrays.equals(checkAr, sortTest(ar, "bubble", false)));
        Assert.assertEquals("Sorted array", true, Arrays.equals(checkAr, sortTest(ar, "merge", false)));
        Assert.assertEquals("Sorted array", true, Arrays.equals(checkAr, sortTest(ar, "quick", false)));
        Assert.assertEquals("Sorted array", true, Arrays.equals(checkAr, sortTest(ar, "bogo", false)));

        ar[0] = 1;
        ar[1] = 1;

        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "bubble", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "merge", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "quick", false)));
        Assert.assertEquals("The same array", true, Arrays.equals(ar, sortTest(ar, "bogo", false)));
    }


    @Test
    public void ascendingArrayTest() {
        int[] ar = new int[10000]; //~12470 StackOverflow QuickSort
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i;
        }

        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "bubble", true)));
        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "merge", true)));
        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "quick", true)));

    }


    @Test
    public void descendingArrayTest() {
        int[] ar = new int[10000]; // ~15550 StackOverflow QuickSort
        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar.length - 1 - i;
        }

        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "bubble", true)));
        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "merge", true)));
        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "quick", true)));
    }


    @Test
    public void randomArrayTest() {
        int[] ar = rndArray(50000);

        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "bubble", true)));
        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "merge", true)));
        Assert.assertEquals("Array is sorted", true, isSorted(sortTest(ar, "quick", true)));
    }


// ***** private methods *****

    private int[] sortTest(int[] testArray, String sortName, boolean printExeTime) {
        int[] a = new int[testArray.length];
        System.arraycopy(testArray, 0, a, 0, testArray.length);

        Date start = new Date();
        SortCollection.sort(a, sortName);
        Date stop = new Date();

        if (printExeTime) {
            System.out.println(sortName + "Sort execution time: " + (stop.getTime() - start.getTime()) + " ms");
        }

        return a;
    }

    private int[] rndArray(int size) {
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = (int) (Math.random() * size);
        }
        return ar;
    }

    private static boolean isSorted(int[] array) {
        if (array.length < 2) return true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("array[" + i + "] = " + array[i]);
                return false;
            }
        }
        return true;
    }

//    private static void printArray(int[] array) {
//        for (int e : array) {
//            System.out.println(e);
//        }
//    }
}
