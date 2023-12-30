package leetcode.twoHundredThirtyTwo_implementQueueUsingStacks;

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> s1;
    private final Stack<Integer> s2;

    int front;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if (s1.isEmpty())
            front = x;
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (!s2.isEmpty())
            return s2.peek();
        return front;
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    /*
        ["MyQueue","push","push","push","push","pop","push","pop","pop","pop","pop"]
        [[],[1],[2],[3],[4],[],[5],[],[],[],[]]

        Output: [null,null,null,null,null,1,null,4,5,3,2]
        Expected: [null,null,null,null,null,1,null,2,3,4,5]
     */
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.pop();
        queue.push(5);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("Done");
    }
}
