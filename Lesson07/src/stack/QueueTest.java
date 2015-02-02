package stack;

import junit.framework.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class QueueTest {

    @Test
    public void testNew() {
        Queue q = new Queue();
        Assert.assertEquals("Check size of new Stack", 0, q.getSize());
        try {
            q.getHead();
        } catch (EmptyStackException e) {
            System.out.println("getHead() exception: " + e);
        }
        try {
            q.poll();
        } catch (EmptyStackException e) {
            System.out.println("poll() exception: " + e);
        }
    }


    @Test
    public void testAddPoll() {
        Queue q = new Queue();

        // add
        q.add("one");
        Assert.assertEquals("Get the Head of the queue", "one", q.getHead());
        Assert.assertEquals("Get the size of the queue", 1, q.getSize());

        q.add("two");
        Assert.assertEquals("Get the Head of the queue", "one", q.getHead());
        Assert.assertEquals("Get the size of the queue", 2, q.getSize());

        q.add("three");
        Assert.assertEquals("Get the Head of the queue", "one", q.getHead());
        Assert.assertEquals("Get the size of the queue", 3, q.getSize());

        // poll
        Assert.assertEquals("Get and remove the Head of the queue", "one", q.poll());
        Assert.assertEquals("Get the size of the stack", 2, q.getSize());

        Assert.assertEquals("Get and remove the Head of the queue", "two", q.poll());
        Assert.assertEquals("Get the size of the stack", 1, q.getSize());

        Assert.assertEquals("Get and remove the Head of the queue", "three", q.poll());
        Assert.assertEquals("Get the size of the stack", 0, q.getSize());

        try {
            q.getHead();
        } catch (EmptyStackException e) {
            System.out.println("getHead() exception: " + e);
        }
        try {
            q.poll();
        } catch (EmptyStackException e) {
            System.out.println("poll() exception: " + e);
        }
    }

}
