package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequee {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(0);
        deque.add(3);
        deque.add(2);
        System.out.println(deque.peek());
        System.out.println(deque);

    }
}
