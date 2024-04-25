package queue;

public class QueueUsingLL {

    public static void main(String[] args) {

        QueueLL queueLL = new QueueLL();
        queueLL.enqueue(10);
        queueLL.enqueue(20);
        queueLL.enqueue(30);
        queueLL.enqueue(40);
        queueLL.enqueue(50);
        System.out.println("isEmpty: "+ queueLL.isEmpty());
        System.out.println("Dequeue: "+ queueLL.dequeue());
        System.out.println("Peek: "+ queueLL.peek());
        System.out.println("Size: "+ queueLL.getSize());
        queueLL.viewQueueLL();

    }

}

class QueueLL {

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public QueueLL() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }


    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    public int getSize() {
        return size;
    }


    public void enqueue(int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }

        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -404;

        } else if (front == rear) {

            Node node = front;
            front = rear = null;
            return node.data;

        } else {

            Node deNode = front;
            front = front.next;
            deNode.next = null;
            size--;
            return deNode.data;

        }

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -404;
        }

        return front.data;
    }

    public void viewQueueLL(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }

        // 1->2->3->4->5->
        Node t = front;
        while (t != null){
            System.out.println(t.data+ " ");
            t = t.next;
        }
    }
}

