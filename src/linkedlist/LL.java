package linkedlist;

public class LL {

    Node head;
    private int length;

     class Node {
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

         if(index > getSize() || index == 0){
             System.out.println("index is not valid");
             return;
         }

         for(int i=0; i < getSize(); i++){

             if(index == i){

             }
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

    public void removeElement(String data){

         // 1 -> 2 -> 3 -> 4 -> null
        Node currNode = head, prev = null;

        if(currNode != null && currNode.data.equalsIgnoreCase(data)){
            head = currNode.next;
            return;
        }


        while (currNode != null && !currNode.data.equalsIgnoreCase(data)) {

            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode == null)
            return;

        prev.next = currNode.next;

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
        list.removeElement("b");

        list.printList();
        System.out.println("Size: "+list.getSize());
    }
}
