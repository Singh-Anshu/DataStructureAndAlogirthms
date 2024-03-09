package collections;
import java.util.Collections;
    import java.util.PriorityQueue;

public class PriorityQuesDemo {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        pq.add(10);
        pq.add(15);
        pq.add(20);
        pq.add(5);

        System.out.println("PQ Size: "+pq.size());
        System.out.println("PQ contains: "+pq.contains(10));
        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }
}
