package stack.list;

public class Node {

    private Object item;
    private Node next;
    private Node prev;

    Node(Node prev, Object item, Node next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    //get & set current element
    public Object getItem(){
        return item;
    }
    public void setItem(Object e){
        item = e;
    }

    //get & set next element node
    public Node getNext() {
        return next;
    }
    public void setNext(Node n) {
        next = n;
    }

    //get & set previous element node
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node n) {
        prev = n;
    }
}
