package stack.list;

public class LinkedList {

    // Variables
    int size = 0;
    Node last;
    Node first;

    // Constructors
    public LinkedList() {}

    // Public methods
    public int add(Object value) {
        linkLast(value);
        return size - 1;
    }

    public Object get(int index) {
        checkItemIndex(index);
        return node(index).getItem();
    }

    public Object remove(int index) {
        checkItemIndex(index);
        return unlink(node(index));
    }

    public int remove(Object value) {
        int i = indexOf(value);
        if (i != -1) unlink(node(i));
        return i;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object value) {
        Node n = first;
        if (value == null) {
            for (int i = 0; i < size; i++) {
                if (n.getItem() == null) return i;
                n = n.getNext();
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (n.getItem().equals(value)) return i;
                n = n.getNext();
            }
        }
        return -1;
    }


    // *** Private methods ***
    private void checkItemIndex(int index) {
        if ( (index < 0) || (index >= size) ) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. Size: " + size);
        }
    }

    // Add an item to the end of the list
    private void linkLast(Object e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.setNext(newNode);
        size++;
    }

    // Find and return Node by index
    private Node node(int index) {
        if (index < size/2) {
            Node n = first;
            for (int i = 0; i < index; i++) {
                n = n.getNext();
            }
            return n;
        } else {
            Node n = last;
            for (int i = size - 1; i > index; i--) {
                n = n.getPrev();
            }
            return n;
        }
    }

    // Remove specified Node
    private Object unlink(Node n) {
        final Object item = n.getItem();
        final Node next = n.getNext();
        final Node prev = n.getPrev();

        if (prev == null) {
            first = next;
        } else {
            prev.setNext(next);
            n.setPrev(null);
        }

        if (next == null) {
            last = prev;
        } else {
            next.setPrev(prev);
            n.setNext(null);
        }
        n.setItem(null);
        size--;
        return item;
    }
}

