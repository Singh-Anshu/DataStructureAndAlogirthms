package queue;

import java.util.Arrays;

public class CircularQueueUsingArray {


    static class Queue {

        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static Boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static Boolean isFull(){
            return (rear + 1) % size == front;
        }
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear +1) % size;   // This Statement is Very Imp for Circular imp
            arr[rear] = data;
        }

        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }

            return result;
        }

        // 1,2,3,4,5
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        Queue.add(40);
        Queue.add(50);
        System.out.println("queue: "+ Arrays.toString(Queue.arr));
        System.out.println("Remove: "+Queue.remove());
        Queue.add(60);
        System.out.println("Remove: "+Queue.remove());
        Queue.add(70);
        System.out.println("queue: "+ Arrays.toString(Queue.arr));

        System.out.println("Peek element: "+ Queue.peek());
    }
}
