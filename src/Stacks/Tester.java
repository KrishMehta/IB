package Stacks;

/**
 * Class created by Krish
 */

public class Tester {

    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.empty();

    }

}
