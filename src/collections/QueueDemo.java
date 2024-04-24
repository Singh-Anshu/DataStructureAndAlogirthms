package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("anshu");
        queue.add("nihal");
        queue.add("sachin");
        queue.add("vikrant");

        System.out.println("Queue:- " + queue);
        System.out.println("Peek Element:- " +queue.peek());
    }
}
