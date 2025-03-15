package Stack;

import java.util.Queue;
import java.util.Stack;

// removing efficient

public class MyQueue2 {
    private Stack<Integer> first;
    private Stack<Integer> second;
//    private Queue<Integer>

    public MyQueue2() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {

        while (!first.empty()){
            second.push(first.pop());
        }

        first.push(x);

        while (!second.empty()){
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
       return first.peek();
    }

    public boolean empty() {
        return first.empty();
    }
}