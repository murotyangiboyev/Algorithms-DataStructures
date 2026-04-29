package Queue;

import java.util.PriorityQueue;

public class PriorityQueuee {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(0);
        pq.add(100);
        pq.add(101);

        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
