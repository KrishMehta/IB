package LinkedList.Singly;

/**
 * Class created by Krish
 */

public class Node {
    public Node next = null;
    public Object data;

    public Node(Object data) {
        this.data = data;
    }

    public void display() {
        System.out.println("{" + data + "}");
    }
}