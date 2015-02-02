public class SortCollection {
    public static void sort(int[] array, String sortName) {
        switch (sortName.toLowerCase().trim()) {
            case "merge":
                MergeSort.sort(array);
                break;
            case "quick":
                QuickSort.sort(array);
                break;
            case "bubble":
                BubbleSort.sort(array);
                break;
            case "bogo":
                BogoSort.sort(array);
                break;
        }
    }
}
