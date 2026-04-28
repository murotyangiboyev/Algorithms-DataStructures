package Map;

import com.sun.source.tree.Tree;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapp {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "cc");
        map.put(4, "dd");
        map.put(1, "zz");
        map.put(1, "ff");
        map.put(2, "bb");

        map.remove(4);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println(map.firstKey());
        System.out.println(map.firstEntry().getValue());
        System.out.println(map.lastKey());
        System.out.println(map.lastEntry().getValue());
        System.out.println(map.ceilingKey(100));
        System.out.println(map.floorEntry(100).getValue());
        System.out.println(map.higherKey(1));
        System.out.println(map.lowerEntry(3).getValue());
    }
}
