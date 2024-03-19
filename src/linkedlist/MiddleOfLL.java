package linkedlist;

public class MiddleOfLL {


    /*
     * Problem Statement:
     * Leetcode: 876. Middle of the Linked List
     * Given the head of a singly linked list, return the middle node of the linked list.
     * If there are two middle nodes, return the second middle node.
     *
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3.
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ListNode head;

    public void addElement(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;
    }

    public ListNode middleNode(ListNode head) {

        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public static void main(String[] args) {

        MiddleOfLL ml = new MiddleOfLL();
        ml.addElement(1);
        ml.addElement(2);
        ml.addElement(3);
        ml.addElement(4);
        ml.addElement(5);
        ml.addElement(6);
        System.out.println(ml.middleNode(ml.head).val + " ");

    }
}
