package LinkedList.Singly;

/**
 * Class created by Krish
 */

public class Tester {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(new Node(5));
        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        list.remove(2);
        list.remove(1);
        list.removeFirst();
        System.out.println(list.isEmpty());
        list.displayList();
    }

}
