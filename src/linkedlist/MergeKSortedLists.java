package linkedlist;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    /*
     *
     * Problem Statement:
     *
     * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
     * Merge all the linked-lists into one sorted linked-list and return it.
     *
     * Example 1:
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [  1->4->5,
     *    1->3->4,
     *    2->6
     * ]
     * merging them into one sorted list:
     * 1->1->2->3->4->4->5->6
     *
     * Example 2:
     * Input: lists = []
     * Output: []
     *
     * Example 3:
     * Input: lists = [[]]
     * Output: []
     *
     * */

    private static class ListNode {
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

    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0 ) return null;

        PriorityQueue<ListNode> p = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < lists.length; i++) {
            ListNode x = lists[i];
            while (x != null) {
                p.add(x);
                x = x.next;
            }
        }

        ListNode ans = p.poll();
        ListNode temp = ans;
        while (p.size() > 0) {
            temp.next = p.poll();
            temp = temp.next;
        }
        if (temp != null)
            temp.next = null;
        return ans;

    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        printList(listNode1);

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);

        listNode4.next = listNode5;
        listNode5.next = listNode6;
        printList(listNode4);

        ListNode listNode7 = new ListNode(2);
        ListNode listNode8 = new ListNode(6);
        ListNode listNode9 = new ListNode(7);

        listNode7.next = listNode8;
        listNode8.next = listNode9;
        printList(listNode7);

        ListNode[] arr = {listNode1, listNode4, listNode7};
        printList(mergeKLists(arr));
    }

}
