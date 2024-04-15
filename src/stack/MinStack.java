package stack;

import java.util.Stack;

public class MinStack {

    /*
    Problem Statement: LeetCode 155. Min Stack

    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    Implement the MinStack class:
    1. MinStack() initializes the stack object.
    2. void push(int val) pushes the element val onto the stack.
    3. void pop() removes the element on the top of the stack.
    4. int top() gets the top element of the stack.
    5. int getMin() retrieves the minimum element in the stack.

    You must implement a solution with O(1) time complexity for each function.


    Example 1:

    Input
    ["MinStack","push","push","push","getMin","pop","top","getMin"]
    [[],[-2],[0],[-3],[],[],[],[]]

    Output
    [null,null,null,null,-3,null,0,-2]

    Explanation
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top();    // return 0
    minStack.getMin(); // return -2

     */

    Stack<Integer> actual;
    Stack<Integer> preMin;

    public MinStack() {
        actual = new Stack<>();
        preMin = new Stack<>();

    }

    public void push(int val) {
        actual.push(val);
        if (!preMin.empty())
            preMin.push(Math.min(val, preMin.peek()));
        else
            preMin.push(val);
    }

    public void pop() {
        actual.pop();
        preMin.pop();
    }

    public int top() {
        return actual.peek();
    }

    public int getMin() {
        return preMin.peek();
    }


    public static void main(String[] args) {

        MinStack minstack = new MinStack();
        minstack.push(-2);
        minstack.push(0);
        minstack.push(-3);
        System.out.println("get Min: " + minstack.getMin());
        System.out.println("pop");
        minstack.pop();
        System.out.println("top : " + minstack.top());
        System.out.println("get Min: " + minstack.getMin());

    }
}
