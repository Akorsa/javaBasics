package maps;

public class Pair {

//    private int hash;
    private String key;
    private String value;
    private Pair next;

    public Pair(String key, String value, Pair next) {
//        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Pair getNext() {
        return next;
    }

    public void setNext(Pair next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

//    public void setKey(String key) {
//        this.key = key;
//    }

//    public int getHash() {
//        return hash;
//    }
//
//    public void setHash(int hash) {
//        this.hash = hash;
//    }
}
