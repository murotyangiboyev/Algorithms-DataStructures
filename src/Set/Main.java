package Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(100);
        hashSet.add(4);
        hashSet.add(200);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);

        System.out.println(hashSet);

        // Hashset does not store based on sorting , it stores based on hashing

    }
}
