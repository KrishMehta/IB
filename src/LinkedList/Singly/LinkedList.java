package LinkedList.Singly;

/**
 * Class created by Krish
 */

public class LinkedList {

    public Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    @SuppressWarnings("Duplicates")
    public void add(int index, Object o) {
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        Node next = current.next;
        current.next = new Node(o);
        current.next.next = next;
    }

    @SuppressWarnings("Duplicates")
    public boolean add(Object o) {
        addLast(o);
        return true;
    }

    public void addFirst(Object o) {
        Node node = new Node(o);
        node.next = head;
        head = node;
    }

    @SuppressWarnings("Duplicates")
    public void addLast(Object o) {
        if (isEmpty()) {
            addFirst(o);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(o);
        }
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

    public boolean contains(Object o) {
        Node current = head;
        while (current.next != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current.next != null) {
            index++;
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
        }
        return -1;
    }

    public boolean isEmpty() {
        return head.data == null;
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
        return temp.data;
    }

    // todo
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

    public Object removeFirst() {
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    public Object removeLast() {
        int index = 0;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            index++;
        }
        return remove(index);
    }

    @SuppressWarnings("Duplicates")
    public void set(int index, Object data) {
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
    public void displayList() {
        System.out.println("List (First --> Last)");
        Node current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

}
