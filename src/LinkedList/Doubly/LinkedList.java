package LinkedList.Doubly;

/**
 * Class created by Krish
 */

public class LinkedList {

    private class Node {
        private Node next = null;
        private Node previous = null;
        private Object data;

        private Node(Object data) {
            this.data = data;
        }

        public void display() {
            System.out.println("{" + data + "}");
        }
    }

    private Node head, tail;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    @SuppressWarnings("Duplicates")
    public void add(Object data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    @SuppressWarnings("Duplicates")
    public void add(Object data, int index) {
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }

        Node next = current.next;
        current.next = new Node(data);
        current.next.next = next;
    }

    @SuppressWarnings("Duplicates")
    public void addFirst(Object data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    @SuppressWarnings("Duplicates")
    public Object remove(Object data) {
        int index = 0;
        Node current = head;
        while (current.data != data) {
            current = current.next;
            index++;
        }
        return remove(index);
    }

    @SuppressWarnings("Duplicates")
    public Object remove(int index) {
        int i = 0;
        Node current = head;
        while (i != index - 1) {
            i++;
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        return temp;
    }

    public Object removeFirst() {
        Object temp = head;
        head = head.next;
        return temp;
    }

    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @SuppressWarnings("Duplicates")
    public void set(Object data, int index) {
        Node node = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = node;
        node.next = temp.next;
    }

    @SuppressWarnings("Duplicates")
    public void clear() {
        Node current = head;
        while (current.next != null) {
            current.data = null;
            current = current.next;
        }
        current.data = null;
    }

    public boolean isEmpty() {
        return head.data == null;
    }

    @SuppressWarnings("Duplicates")
    public void displayList() {
        System.out.println("List (First --> Last)");
        Node current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }


}
