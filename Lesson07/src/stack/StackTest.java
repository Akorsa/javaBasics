package stack;

import junit.framework.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest {

    @Test
    public void testNew() {
        Stack st = new Stack();
        Assert.assertEquals("Check size of new Stack", 0, st.getSize());
        try {
            st.getTop();
        } catch (EmptyStackException e) {
            System.out.println("getTop() exception: " + e);
        }
        try {
            st.pop();
        } catch (EmptyStackException e) {
            System.out.println("pop() exception: " + e);
        }
    }

    @Test
    public void testPushPop() {
        Stack st = new Stack();

        // push
        st.push("one");
        Assert.assertEquals("Get the Top of the stack", "one", st.getTop());
        Assert.assertEquals("Get the size of the stack", 1, st.getSize());

        st.push("two");
        Assert.assertEquals("Get the Top of the stack", "two", st.getTop());
        Assert.assertEquals("Get the size of the stack", 2, st.getSize());

        st.push("three");
        Assert.assertEquals("Get the Top of the stack", "three", st.getTop());
        Assert.assertEquals("Get the size of the stack", 3, st.getSize());

        // pop
        Assert.assertEquals("Get and remove the Top of the stack", "three", st.pop());
        Assert.assertEquals("Get the size of the stack", 2, st.getSize());

        Assert.assertEquals("Get and remove the Top of the stack", "two", st.pop());
        Assert.assertEquals("Get the size of the stack", 1, st.getSize());

        Assert.assertEquals("Get and remove the Top of the stack", "one", st.pop());
        Assert.assertEquals("Get the size of the stack", 0, st.getSize());

        try {
            st.getTop();
        } catch (EmptyStackException e) {
            System.out.println("getTop() exception: " + e);
        }
        try {
            st.pop();
        } catch (EmptyStackException e) {
            System.out.println("pop() exception: " + e);
        }
    }
}
