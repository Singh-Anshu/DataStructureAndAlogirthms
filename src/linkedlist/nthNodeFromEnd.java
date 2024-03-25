package linkedlist;

public class nthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n) {

        int size = getLength(head);
        if (n > size) {
            return null;
        }

        int m = size - n + 1;
        Node currNode = head;
        for (int i = 1; i < m; i++) {
            currNode = currNode.next;
        }
        return currNode;

    }

    // Optimized Method
    public static Node nthNodeFromEnd(Node head, int n) {

        int size = getLength(head);
        if (n > size) {
            return null;
        }

        Node slow = head, fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public static Node removeNthNodeFromEnd(int pos, Node head) {
        int size = getLength(head);
        if (pos > size) {
            return null;
        }

        if (pos == size) {
            head = head.next;
            return head;
        }

        Node slow = head, fast = head;

        for (int i = 1; i <= pos; i++) {
            fast = fast.next;
        }


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next != null ? slow.next.next : null;
        return head;

    }

    public static void printList(Node head) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static int getLength(Node head) {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node currNode = head;


        while (currNode.next != null) {
            count++;
            currNode = currNode.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Size of LL is: " + getLength(a));

        int lastNthnode = 6;
        Node tempNode = nthNodeFromEnd(a, lastNthnode);
        System.out.println("Data from last " + lastNthnode + " Node in LL is: " + tempNode.data);
        printList(a);
        a = removeNthNodeFromEnd(6, a);
        printList(a);

    }

}
