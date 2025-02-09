package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Inbuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(24);
        stack.push(25);
//
//        System.out.println(stack.pop());

        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(23);
        deq.addLast(12);
        deq.addFirst(1);

        deq.removeLast();
        deq.removeFirst();

        for (int i = 0; i < deq.size() ; i++) {
        System.out.println(deq.getFirst());
        }
    }
}
