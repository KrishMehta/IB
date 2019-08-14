package Queues;

/**
 * Class created by Krish
 */

public class Tester {

    public static void main(String[] args) {

        Queue queue = new Queue(5);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());

    }

}
