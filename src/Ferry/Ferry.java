package Ferry;

import Queues.Queue;
import Stacks.Stack;

/**
 * Class created by Krish
 */

public class Ferry {

    public static void main(String[] args) {

        Stack stack = new Stack(10);
        Queue queue = new Queue(10);
        Stack ferry1 = new Stack(10);
        Stack ferry2 = new Stack(10);

        for (int i = 0; i < 10; i++) {
            stack.push(new Car(i));
        }
        System.out.println("Stack waiting area: ");
        stack.view();
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            queue.enqueue(stack.pop());
        }
        System.out.println("Queue waiting area: ");
        queue.view();
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            ferry1.push(queue.dequeue());
        }
        System.out.println("Ferry.Ferry(1) area:");
        ferry1.view();
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {
            stack.push(new Car(i));
        }
        System.out.println("Stack waiting area:");
        stack.view();
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {
            queue.enqueue(stack.pop());
        }
        System.out.println("Queue waiting area:");
        queue.view();
        System.out.println("\n");

        for (int i = 10; i < 20; i++) {
            ferry2.push(queue.dequeue());
        }
        System.out.println("Ferry.Ferry(2) area:");
        ferry2.view();
        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(ferry1.pop());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ferry2.pop());
        }

    }

}
