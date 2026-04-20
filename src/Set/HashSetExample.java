package Set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        System.out.println(hashSet.contains(1));

    }
}
