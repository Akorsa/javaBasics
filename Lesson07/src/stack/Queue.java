package stack;

import stack.list.LinkedList;
import java.util.EmptyStackException;

public class Queue {

    private LinkedList ll = new LinkedList();

    public Queue() {}

    public void add(Object e) {
        ll.add(e);
    }

    public Object poll() {
        if (ll.size() == 0) {
            throw new EmptyStackException();
        }
        return ll.remove(0);
    }

    public int getSize() {
        return ll.size();
    }

    public Object getHead() {
        if (ll.size() == 0) {
            throw new EmptyStackException();
        }
        return ll.get(0);
    }
}
