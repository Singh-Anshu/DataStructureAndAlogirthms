package stack;

import java.util.ArrayList;
public class MyStack {

    /*
    * Implementing Stack using ArrayList
     */
    private final ArrayList<Integer> arr;
    int len;

    public MyStack() {

        arr = new ArrayList<>();
        len = 0;
    }

    public void push(int value) {
        arr.add(value);
        len += 1;
    }

    public int pop() {
        if (len == 0)
            return -1;

        int ans = arr.get(len - 1);
        arr.remove(len - 1);
        len -= 1;
        return ans;
    }


    public int peek() {
        if (len == 0)
            return -1;

        return arr.get(len - 1);
    }

    public boolean empty() {
        return len == 0;
    }


    public void clear() {

        while (!empty()) {
            pop();
        }
    }


    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println(myStack.arr);
        System.out.println("Pop Element: " + myStack.pop());
        System.out.println("Peek Element: " + myStack.peek());
        System.out.println("Stack Empty: " + myStack.empty());
        System.out.println("Clear Stack");
        myStack.clear();
        System.out.println("Stack Empty: " + myStack.empty());
        System.out.println(myStack.arr);

    }
}
