package maps;

import junit.framework.Assert;
import org.junit.Test;

public class MapTest {

    public static final String FIRST_STRING = "First String";
    public static final String SECOND_STRING = "Second String";
    public static final String THIRD_STRING = "Third String";

    @Test
    public void addTest() {
        Mappable mappable = getMappable();

        mappable.add("1", FIRST_STRING);
        mappable.add("2", SECOND_STRING);

        Assert.assertEquals("Should contain key 1", FIRST_STRING, mappable.containsKey("1"));
        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));
        Assert.assertEquals("Should not contain key 3", null, mappable.containsKey("3"));
    }

    @Test
    public void addExisting() {
        Mappable mappable = getMappable();

        mappable.add("1", FIRST_STRING);
        mappable.add("2", SECOND_STRING);

        Assert.assertEquals("Should contain key 1", FIRST_STRING, mappable.containsKey("1"));
        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));

        mappable.add("1", THIRD_STRING);

        Assert.assertEquals("Should contain key 1", THIRD_STRING, mappable.containsKey("1"));
        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));
    }

    @Test
    public void removeTest() {
        Mappable mappable = getMappable();

        mappable.add("1", FIRST_STRING);
        mappable.add("2", SECOND_STRING);
        mappable.add("3", THIRD_STRING);

        Assert.assertEquals("Should contain key 1", FIRST_STRING, mappable.containsKey("1"));
        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));
        Assert.assertEquals("Should contain key 3", THIRD_STRING, mappable.containsKey("3"));

        mappable.remove("1");

        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));
        Assert.assertEquals("Should contain key 3", THIRD_STRING, mappable.containsKey("3"));

        mappable.remove("1");

        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));
        Assert.assertEquals("Should contain key 3", THIRD_STRING, mappable.containsKey("3"));

        mappable.remove("4");

        Assert.assertEquals("Should contain key 2", SECOND_STRING, mappable.containsKey("2"));
        Assert.assertEquals("Should contain key 3", THIRD_STRING, mappable.containsKey("3"));
    }

    @Test(timeout = 5500)
    public void testBig() {
        Mappable mappable = getMappable();
        int limit = 1000000;

        for (int i = 0; i < limit; i++) {
            mappable.add(String.valueOf(i), "Value for " + i);
        }
        mappable.add(String.valueOf(limit + 1), "Value for " + (limit + 1));

        for (int i = 0; i < limit; i++) {
            Assert.assertEquals("Value for " + i, mappable.containsKey(String.valueOf(i)));
        }

        for (int i = 0; i < limit; i++) {
            mappable.remove(String.valueOf(i));
        }

        Assert.assertEquals(null, mappable.containsKey(String.valueOf(1)));
    }

    protected Mappable getMappable() {
        /*
        PUT YOUR CODE HERE
         */
        return new AssociativeArray();
    }
}
