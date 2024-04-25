package queue;

import java.util.ArrayList;

public class QueueUsingArrayList {

    public static void main(String[] args) {

        MyQueue obj = new MyQueue();
        obj.push(8);
        obj.push(15);
        obj.push(57);
        obj.push(44);
        System.out.println("Pop: "+obj.pop());
        System.out.println("Peek: "+obj.peek());
        System.out.println(obj.empty());

    }

}


class MyQueue {
    private ArrayList<Integer> arr;
    private int front;

    public MyQueue() {
        arr = new ArrayList<>();
        front = 0;
    }

    public void push(int x) {
        arr.add(x);
    }

    public int pop() {
        int frontElement = arr.get(front);
        front += 1;
        return frontElement;
    }

    public int peek() {
        return arr.get(front);
    }

    // size = arr.size() - front;
    public boolean empty() {
        return front == arr.size();
    }
}
