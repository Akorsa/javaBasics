package maps;

public class AssociativeArray implements Mappable {

    private Pair[] asArray;
    static final double LOAD_FACTOR = 0.75f;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size;
    private int threshold;

    public AssociativeArray(int initialCapacity){
        if (initialCapacity < DEFAULT_INITIAL_CAPACITY) {
            initialCapacity = DEFAULT_INITIAL_CAPACITY;
        }
        asArray = new Pair[initialCapacity];
        threshold = (int) (LOAD_FACTOR * initialCapacity);
    }

    public AssociativeArray() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public String add(String key, String value) {

        // rehash if needed
        if (size >= threshold) {
            resizeAndRehash();
            threshold = (int)(LOAD_FACTOR * asArray.length);
        }

        // get index
        int index = hash(key);

        // if the specified Pair == null, create a new Pair
        if (asArray[index] == null) {
            asArray[index] = new Pair(key, value, null);
            size++;
            return null;
        }

        // if duplicate key
        for (Pair p = asArray[index]; p != null; p = p.getNext()) {
            if (p.getKey().equals(key)) {
                String oldValue = p.getValue();
                p.setValue(value);
                return oldValue;
            }
        }

        // if nonduplicate key
        asArray[index] = new Pair(key, value, asArray[index]);
        size++;
        return null;
    }

    public String containsKey(String key) {
        // get the index in the asArray
        int index = hash(key);

        if (asArray[index] == null) {
            return null;
        }
        for (Pair p = asArray[index]; p != null; p = p.getNext()) {
            if (p.getKey().equals(key)) {
                return p.getValue();
            }
        }

        return null;
    }

    public String remove(String key) {
        // get the index in the asArray
        int index = hash(key);
        //
        if (asArray[index] == null) {
            return null;
        }

        Pair prev = null;
        for (Pair p = asArray[index]; p != null; prev = p, p = p.getNext()) {
            if (p.getKey().equals(key)) {
                size--;
                if (prev == null) {
                    asArray[index] = p.getNext();
                } else {
                    prev.setNext(p.getNext());
                }
                return p.getValue();
            }
        }
        return null;
    }

    // *** Private methods ***
    private int hash(String key, int arrayLength) {
        return Math.abs(key.hashCode() % arrayLength);
    }

    private int hash(String key) {
        return hash(key, asArray.length);
    }

    private void resizeAndRehash() {
        Pair[] arrayTmp = new Pair[asArray.length * 2];

        int indexTmp;
        for (Pair pair : asArray) {
            if (pair != null) {
                for (Pair p = pair; p != null; p = p.getNext()) {
                    indexTmp = hash(p.getKey(), arrayTmp.length);
                    if (arrayTmp[indexTmp] == null) {
                        arrayTmp[indexTmp] = new Pair(p.getKey(),p.getValue(),null);
                    } else {
                        arrayTmp[indexTmp] = new Pair(p.getKey(), p.getValue(), arrayTmp[indexTmp]);
                    }
                }
            }
        }
        asArray = arrayTmp;
    }
}
