package lists;

public class Node {

    private String item;
    private Node next;
    private Node prev;

    Node(Node prev, String item, Node next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    //get & set current element
    public String getItem(){
        return item;
    }
    public void setItem(String e){
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
