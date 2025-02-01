package com.Queue.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q225 {
    /*
    Implement the MyStack class:

    void push(int x) Pushes element x to the top of the stack.
    int pop() Removes the element on the top of the stack and returns it.
    int top() Returns the element on the top of the stack.
    boolean empty() Returns true if the stack is empty, false otherwise.

    Notes:
        You must use only standard operations of a queue, which means that only push to back
        peek/pop from front, size and is empty operations are valid.

        Depending on your language, the queue may not be supported natively. You may simulate
        queue using a list or deque (double-ended queue) as long as you use only a queue's standard
        operations.
    */

    class MyStack {
        private Queue<Integer> forward;
        private Queue<Integer> backward;

        public MyStack() {
            forward = new LinkedList<>();
            backward = new LinkedList<>();
        }

        public void push(int x) {
            forward.add(x);
        }

        public int pop() {
            while (forward.size() > 1) {
                backward.add(forward.poll());
            }
            int rst = forward.poll();
            swap();
            return rst;
        }

        public int top() {
            while (forward.size() > 1) {
                backward.add(forward.poll());
            }
            int rst = forward.poll();
            backward.add(rst);
            swap();
            return rst;
        }

        public boolean empty() {
            return forward.isEmpty();
        }

        private void swap() {
            Queue<Integer> temp = forward;
            forward = backward;
            backward = temp;
        }
    }
}
