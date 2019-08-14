package Stacks;

/**
 * Class created by Krish
 */

public class Stack {

    private Object[] stack;
    private int stackPointer;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new Object[size];
        stackPointer = -1;
    }

    public void push(Object o) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException();
        else
            stack[++stackPointer] = o;
    }

    public Object pop() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException();
        else
            return stack[stackPointer--];
    }

    public Object peek() {
        return stack[stackPointer];
    }

    public void empty() {
        for (Object o : stack) {
            o = null;
        }
    }

    public boolean isEmpty() {
        return stackPointer == -1;
    }

    public boolean isFull() {
        return stackPointer == size - 1;
    }

    @SuppressWarnings("Duplicates")
    public void view() {
        System.out.print("[ ");
        for (Object o : stack) {
            System.out.print(o + " ");
        }
        System.out.print("]");
    }

}
