package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class HashMapp {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        System.out.println(map.containsValue("a"));

        Collection<String> values =  map.values();

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
