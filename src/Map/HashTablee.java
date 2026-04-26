package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashTablee {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "aa");
        hashtable.put(2, "bb");
        hashtable.put(3, "cc");
        hashtable.put(4, "dd");
        hashtable.put(5, "ee");
        hashtable.put(3, "33");
        String s = hashtable.toString();
        System.out.println(s);

        Set<Integer>  keySet = hashtable.keySet();
        System.out.println(keySet);



    }
}
