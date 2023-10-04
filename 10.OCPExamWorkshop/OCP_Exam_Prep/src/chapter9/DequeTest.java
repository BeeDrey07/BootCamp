package chapter9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
//        deque.offerFirst(10);
//        deque.offerLast(4);
//        System.out.println("peeking");
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());
//        deque.pollFirst();
//        deque.pollLast();
//        System.out.println("peeking");
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.peekLast());

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack);
        stack.poll();
        stack.pop();
        System.out.println(stack);
    }
}
