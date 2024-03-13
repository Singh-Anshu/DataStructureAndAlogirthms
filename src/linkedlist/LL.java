package linkedlist;

public class LL {

    Node head;
    private int length;

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            length++;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addElement(String data) {
        Node newNode = new Node(data);

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;
    }

    public void addAtIndex(int index, String data) {

        // 1 -> 2 -> 3 -> null
        if (index > getSize() || index == 0) {
            System.out.println("index is not valid");
            return;
        }

        Node newNode = new Node(data);

        Node currNode = head, nextNode = null;

        for (int i = 1; i <= getSize(); i++) {

            if (i == index-1) {

                newNode.next = nextNode;
                currNode.next = newNode;

                length++;
                return;
            }
            currNode = currNode.next;
            nextNode = currNode.next;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printList() {

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

    public void deleteElement(String data) {

        // 1 -> 2 -> 3 -> 4 -> null
        Node currNode = head, prev = null;

        // if we found data in head
        if (currNode != null && currNode.data.equalsIgnoreCase(data)) {
            head = currNode.next;
            length--;
            return;
        }

        while (currNode != null && !currNode.data.equalsIgnoreCase(data)) {

            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode == null)
            return;

        prev.next = currNode.next;
        length--;

    }

    public void deleteFirst() {

        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }

        head = head.next;
        length--;
    }


    public void deleteLast() {

        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }

        Node secondLatNode = head;

        for (int i = 1; i <= getSize(); i++) {

            if (i == getSize() - 1) {
                secondLatNode.next = null;
                length--;
                return;
            }
            secondLatNode = secondLatNode.next;
        }
    }

    public int getSize() {
        return length;
    }


    public static void main(String[] args) {

        LL list = new LL();

        list.addFirst("a");
        list.addElement("b");
        list.addElement("c");
        list.addElement("d");
        list.addElement("e");
        list.addLast("z");
        list.addAtIndex(3, "f");
        //list.deleteFirst();
        //list.deleteLast();
        // list.deleteElement("b");

        list.printList();
        System.out.println("Size: " + list.getSize());
    }
}