package lists;

public interface SimpleList {
    int add(String value);

    String get(int index);

    String remove(int index);

    int remove(String value);

    int size();

    int indexOf(String value);
}
