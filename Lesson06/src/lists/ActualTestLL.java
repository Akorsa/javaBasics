package lists;

public class ActualTestLL extends ListsTest {

    @Override
    protected SimpleList getSimpleList() {
        return new LinkedList();
    }

    @Override
    protected SimpleList getSimpleList(int size) {
        return new LinkedList(size);
    }
}
