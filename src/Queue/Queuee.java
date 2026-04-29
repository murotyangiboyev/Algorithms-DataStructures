package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(59);
        queue.add(23);
        queue.add(30);
        queue.add(14);

        queue.remove(); queue.poll(); // removes from head of the queue!
        System.out.println(queue.peek());// returns the head of the queue !
        System.out.println(queue);

    }
}
