package queue;

public class QueueUsingArray {


    static class Queue {

        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static Boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int front = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // 1,2,3,4,5
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        Queue.add(40);
        Queue.add(50);


        System.out.println("Peek element: "+Queue.peek());
    }
}
