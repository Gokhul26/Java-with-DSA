package DataStructures.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inbuilt {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(89);
        // stack.push(49);
        // stack.push(1);
        // stack.push(43);
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(90);
        // queue.add(32);
        // queue.add(21);
        // queue.add(345);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue);


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(12);
        deque.addFirst(11);
        deque.addLast(90);
        System.out.println(deque);
        // deque.remove();
        // System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque);
    }
}
