package lists;

public class ActualTestDA extends ListsTest {

    @Override
    protected SimpleList getSimpleList() {
        return new DynamicArray();
    }

    @Override
    protected SimpleList getSimpleList(int size) {
        return new DynamicArray(size);
    }
}
