import org.junit.Assert;
import org.junit.Test;

public class TelephoneBookTest {

    @Test
    public void addAndGetTest() {
        TelephoneBook telBook = new TelephoneBook();

        // add
        Assert.assertEquals("add", null, telBook.add("Ivan","+7-926-1234567"));
        Assert.assertEquals("add", null, telBook.add("Mark","+7-926-2345678"));
        Assert.assertEquals("add", null, telBook.add("Boris","+7-926-3456789"));
        Assert.assertEquals("add", null, telBook.add("Lisa","+7-926-4567890"));
        Assert.assertEquals("add", null, telBook.add("Chewbacca","+1-111-111-11-11"));
        Assert.assertEquals("add", null, telBook.add("Lesly1","+1-222-7654321"));
        Assert.assertEquals("add", null, telBook.add("Lesly2","+1-222-7654322"));
        Assert.assertEquals("add", null, telBook.add("Lesly3","+1-222-7654323"));
        Assert.assertEquals("add", null, telBook.add("Lesly4","+1-222-7654324"));
        Assert.assertEquals("add", null, telBook.add("Lesly5","+1-222-7654325"));
        Assert.assertEquals("add", null, telBook.add("Lesly6","+1-222-7654326"));
        Assert.assertEquals("add", null, telBook.add("Lesly7","+1-222-7654327"));
        Assert.assertEquals("add", null, telBook.add("Lesly8","+1-222-7654328"));
        Assert.assertEquals("add", null, telBook.add("Lesly9","+1-222-7654329"));
        Assert.assertEquals("add", null, telBook.add("Lesly10","+1-222-7654310"));
        Assert.assertEquals("add", null, telBook.add("Lesly11","+1-222-7654311"));
        Assert.assertEquals("add", null, telBook.add("Lesly12","+1-222-7654312"));
        Assert.assertEquals("add", null, telBook.add("Lesly13","+1-222-7654313"));
        Assert.assertEquals("add", null, telBook.add("Lesly14","+1-222-7654314"));
        Assert.assertEquals("add", null, telBook.add("Lesly15","+1-222-7654315"));
        Assert.assertEquals("add", null, telBook.add("Lesly16","+1-222-7654316"));
        Assert.assertEquals("add", null, telBook.add("Lesly17","+1-222-7654317"));
        Assert.assertEquals("add", null, telBook.add("Lesly18","+1-222-7654318"));

        // get
        Assert.assertEquals("get", "+7-926-1234567", telBook.get("Ivan"));
        Assert.assertEquals("get", "+7-926-2345678", telBook.get("Mark"));
        Assert.assertEquals("get", "+7-926-3456789", telBook.get("Boris"));
        Assert.assertEquals("get", "+7-926-4567890", telBook.get("Lisa"));
        Assert.assertEquals("get", "+1-111-111-11-11", telBook.get("Chewbacca"));
        Assert.assertEquals("get", "+1-222-7654321", telBook.get("Lesly1"));
        Assert.assertEquals("get", "+1-222-7654322", telBook.get("Lesly2"));
        Assert.assertEquals("get", "+1-222-7654323", telBook.get("Lesly3"));
        Assert.assertEquals("get", "+1-222-7654324", telBook.get("Lesly4"));
        Assert.assertEquals("get", "+1-222-7654325", telBook.get("Lesly5"));
        Assert.assertEquals("get", "+1-222-7654326", telBook.get("Lesly6"));
        Assert.assertEquals("get", "+1-222-7654327", telBook.get("Lesly7"));
        Assert.assertEquals("get", "+1-222-7654328", telBook.get("Lesly8"));
        Assert.assertEquals("get", "+1-222-7654329", telBook.get("Lesly9"));
        Assert.assertEquals("get", "+1-222-7654310", telBook.get("Lesly10"));
        Assert.assertEquals("get", "+1-222-7654311", telBook.get("Lesly11"));
        Assert.assertEquals("get", "+1-222-7654312", telBook.get("Lesly12"));
        Assert.assertEquals("get", "+1-222-7654313", telBook.get("Lesly13"));
        Assert.assertEquals("get", "+1-222-7654314", telBook.get("Lesly14"));
        Assert.assertEquals("get", "+1-222-7654315", telBook.get("Lesly15"));
        Assert.assertEquals("get", "+1-222-7654316", telBook.get("Lesly16"));
        Assert.assertEquals("get", "+1-222-7654317", telBook.get("Lesly17"));
        Assert.assertEquals("get", "+1-222-7654318", telBook.get("Lesly18"));


        // add the same and get
        Assert.assertEquals("get", "+7-926-4567890", telBook.get("Lisa"));
        Assert.assertEquals("add", "+7-926-4567890", telBook.add("Lisa", "+7-916-444-4444"));
        Assert.assertEquals("get", "+7-916-444-4444", telBook.get("Lisa"));

    }
}
