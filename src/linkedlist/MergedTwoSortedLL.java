package linkedlist;

public class MergedTwoSortedLL {


    /*
    *Problem Statement
    * You are given the heads of two sorted linked lists list1 and list2.
    * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    * Return the head of the merged linked list.
    *
    * Example 1:
    * Input: list1 = [1,2,4], list2 = [1,3,4]
    * Output: [1,1,2,3,4,4]
    *
    * Example 2:
    * Input: list1 = [], list2 = []
    * Output: []
    *
    * Example 3:
    * Input: list1 = [], list2 = [0]
    * Output: [0]
    *
     */
    private  static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static void printList(ListNode head) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        ListNode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;

        if(list2 == null) return list1;


        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
       ListNode listNode1 = new ListNode(1);
       ListNode listNode2 = new ListNode(2);
       ListNode listNode3 = new ListNode(4);

       listNode1.next = listNode2;
       listNode2.next = listNode3;
        printList(listNode1);

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);

        listNode4.next = listNode5;
        listNode5.next = listNode6;
        printList(listNode4);

        printList(mergeTwoLists(listNode1, listNode4));

    }
}
