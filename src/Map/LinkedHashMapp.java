package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "a");
        map.put(10, "cc");
        map.put(20, "bb");
        map.put(30, "dd");
        map.put(15, "ee");

//        System.out.println(map.containsKey(10));
//        for (Map.Entry<Integer, String> m : map.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>(16, 0.75f, true);

        map2.put(1, "a");
        map2.put(2, "b");
        map2.put(3, "c");
        map2.put(4, "d");

        System.out.println(map2);

        System.out.println(map2.get(1));
        System.out.println(map2.get(2));
        System.out.println(map2.get(3));
        System.out.println(map2.get(2));
        System.out.println(map2);
        System.out.println(map2.size());
        int last = map2.firstEntry().getKey();
        map2.remove(map2.firstEntry().getKey());
        System.out.println(map2);
    }
}
