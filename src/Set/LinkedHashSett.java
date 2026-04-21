package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSett {

    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(0);
        set.add(4);

        Iterator<Integer> it = set.iterator();

        int n = it.next();
        int m = it.next();
        System.out.println(n + " " + m);

    }
}
