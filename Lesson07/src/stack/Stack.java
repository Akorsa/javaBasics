package stack;

import stack.list.LinkedList;
import java.util.EmptyStackException;

public class Stack {

    private LinkedList ll = new LinkedList();

    public Stack(){}

    public void push(Object e) {
        ll.add(e);
    }

    public Object pop() {
        if (ll.size() == 0) {
            throw new EmptyStackException();
        }
        return ll.remove(ll.size() - 1);
    }

    public int getSize() {
        return ll.size();
    }

    public Object getTop() {
        if (ll.size() == 0) {
            throw new EmptyStackException();
        }
        return ll.get(ll.size() - 1);
    }
}
