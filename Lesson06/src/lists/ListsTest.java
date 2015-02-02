package lists;

import junit.framework.Assert;
import org.junit.Test;

public abstract class ListsTest {

    @Test
    public void testAdd(){
        SimpleList list = getSimpleList();
        checkList(list);
    }

    @Test
    public void testAddWithSize(){
        SimpleList list = getSimpleList(5);
        checkList(list);
    }

    @Test
    public void testAddWithSmallSize(){
        SimpleList list = getSimpleList(1);
        checkList(list);
    }

    @Test
    public void testSize() {
        assertSize(5, 10);
    }

    private void assertSize(int initialSize, int finalSize) {
        SimpleList list = getSimpleList(initialSize);

        for (int i=0; i< finalSize; i++) {
            list.add("Value " + i);
        }

        Assert.assertEquals("Size", finalSize, list.size());
    }

    private void checkList(SimpleList list) {
        int index = list.add("A String");
        Assert.assertEquals("Index @ First add", 0, index);
        Assert.assertEquals("Size @ first add", 1, list.size());

        index = list.add("Second String");
        Assert.assertEquals("Index @ second add", 1, index);
        Assert.assertEquals("Size @ second add", 2, list.size());

        Assert.assertEquals("Should contain second string", 1,  list.indexOf("Second String"));
        Assert.assertEquals("Should contain first string", 0,  list.indexOf("A String"));
        Assert.assertEquals("Should not contain third string", -1, list.indexOf("Third string"));

        testRemove(list, "first string", "A String", 0, 1);

        list.add("Third string");

        testRemove(list, "second string", "Second String", 0, 1);

        index = list.remove("A String");
        Assert.assertEquals("Index @ removing first string", -1, index);
        Assert.assertEquals("Size @ removing first string", 1, list.size());

        list.add("Firth of Forth");
        String beforeRemove = list.get(0);
        String value = list.remove(0);
        Assert.assertNotSame("Should not contain removed value", beforeRemove, list.get(0));
        Assert.assertEquals("Index @ removing first string", "Third string", value);
        Assert.assertEquals("Size @ removing first string", 1, list.size());

        try {
            value = list.remove(1);
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        Assert.assertNotSame("Index @ removing first string", "Firth of Forth", value);
        Assert.assertEquals("Size @ removing first string", 1, list.size());

        try {
            value = list.remove(-1);
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        Assert.assertNotSame("Index @ removing first string", "A String", value);
        Assert.assertEquals("Size @ removing first string", 1, list.size());

        index = list.indexOf(null);
        Assert.assertEquals("Index of null", -1, index);

        index = list.add(null);
        Assert.assertEquals("Index @ null add", 1, index);
        Assert.assertEquals("Size @ null add", 2, list.size());

        index = list.add("Sixth");
        Assert.assertEquals("Index @ after null add", 2, index);
        Assert.assertEquals("Size @ after null add", 3, list.size());

        index = list.indexOf(null);

        Assert.assertEquals("Index of null after add", 1, index);

        index = list.remove(null);
        Assert.assertEquals("Index @ after null remove", 1, index);
        Assert.assertEquals("Size @ after null remove", 2, list.size());

        value = list.get(0);
        Assert.assertEquals("Value @ get 0", "Firth of Forth", value);

        try {
            value = list.get(-1);
        }
        catch (Exception e) {
            value = "";
            System.out.println("Error: " + e);
        }
        Assert.assertNotSame("Value @ get -1", "Firth of Forth", value);

        try {
            value = list.get(list.size());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        Assert.assertNotSame("Value @ get list size", "Sixth", value);

        list.add("Seven");
        list.add("Sixth");

        Assert.assertEquals("Should find first of duplicates", 1, list.indexOf("Sixth"));

        list.remove("Sixth");
        Assert.assertEquals("Should remove first of duplicates", 2, list.indexOf("Sixth"));
    }

    private void testRemove(SimpleList list, final String name, String value, int expectedIndex, int expectedSize) {
        int index = list.remove(value);
        Assert.assertEquals("Should not contain removed value", -1, list.indexOf(value));
        Assert.assertEquals("Index @ removing " + name, expectedIndex, index);
        Assert.assertEquals("Size @ removing " + name, expectedSize, list.size());
    }

    protected abstract SimpleList getSimpleList();
    protected abstract SimpleList getSimpleList(int size);
}
