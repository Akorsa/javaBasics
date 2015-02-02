package lists;

public class DynamicArray implements SimpleList {

    // Variables
    private String[] array;
    private int lastElementIndex = -1;



    // Constants
    private final double SIZE_MULTIPLY = 1.5;



    // Constructors
    public DynamicArray(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "+ initSize);
        }
        array = new String[initSize];
    }

    public DynamicArray() {
        this(10); // default size of array
    }



    // Methods

    private void indexCheck(int index) {
        if ( index < 0 || index > lastElementIndex ) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. Size: " + (lastElementIndex + 1) );
        }
    }

    @Override
    public int add(String e) {
        lastElementIndex++;

        // if the end of the array -> copy to arrayTmp with increased array size and array = arrayTmp
        if (lastElementIndex > array.length - 1) {
            String[] arrayTmp = new String[(int) (array.length * SIZE_MULTIPLY + 1)];
            System.arraycopy(array, 0, arrayTmp, 0, array.length);
            array = arrayTmp;
//                    new String[array.length + sizeAdd];
//            System.arraycopy(arrayTmp, 0, array, 0, arrayTmp.length);
        }

        // add an element to the end of the array
        array[lastElementIndex] = e;

        return lastElementIndex;
    }

    @Override
    public String get(int index) {
        indexCheck(index);
        return array[index];
    }

    @Override
    public String remove(int index) {
        indexCheck(index);
        String eTmp = array[index];
        if (index != lastElementIndex) {
            String[] arrayTmp = new String[array.length - (index + 1)];
            System.arraycopy(array, index + 1, arrayTmp, 0, array.length - (index + 1));
            System.arraycopy(arrayTmp, 0, array, index, array.length - (index + 1));
        }
        array[array.length - 1] = null;
        lastElementIndex--;
        return eTmp;
    }

    @Override
    public int remove(String value) {
        int i = indexOf(value);
        if (i != -1) {
            remove(i);
        }
        return i;
    }

    @Override
    public int size() {
        return lastElementIndex + 1;
    }

    @Override
    public int indexOf(String value) {
        int i = 0;
        if (value != null) {
            while (!(array[i].equals(value))) {
                i++;
                if (i > lastElementIndex) {
                    return -1;
                }
            }
        } else {
            while (array[i] != null) {
                i++;
                if (i > lastElementIndex) {
                    return -1;
                }
            }
        }
        return i;
    }

}
