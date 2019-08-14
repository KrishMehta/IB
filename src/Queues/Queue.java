package Queues;

/**
 * Class created by Krish
 */

public class Queue {

    private Object[] queue;
    private int size;
    private int items;
    private int front;
    private int back;

    public Queue(int size) {
        this.size = size;
        queue = new Object[size];
        front = 0;
        back = -1;
        items = 0;
    }

    public void enqueue(Object o) {
        if (back == size - 1) {
            back = -1;
        }
        items++;
        queue[++back] = o;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Object top = queue[front++];
            if (front == size) {
                front = 0;
            }
            items--;
            return top;
        }
    }

    public Object peek() {
        return queue[front];
    }

    private boolean isEmpty() {
        return items == 0;
    }

    private boolean isFull() {
        return items == size;
    }

    @SuppressWarnings("Duplicates")
    public void view() {
        System.out.print("[ ");
        for (Object o : queue) {
            System.out.print(o + " ");
        }
        System.out.print("]");
    }

}
