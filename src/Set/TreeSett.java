package Set;

import com.sun.source.tree.Tree;

import java.security.KeyPair;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


class Pair{

    int first;
    int second;

    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

public class TreeSett {

    public static void main(String[] args){

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(0);
        treeSet.add(4);

        int first = treeSet.first();
        int last = treeSet.last();
        int lower = treeSet.lower(4);
        int higher = treeSet.higher(4);

        System.out.println(lower + " "  + higher);

        treeSet.pollFirst();
        treeSet.pollLast();
        System.out.println(treeSet);

        Iterator itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        treeSet.addAll(Arrays.asList(10, 70, 50, 6, 7 , 10));
        System.out.println(treeSet);

        SortedSet<Integer> set2  = treeSet.subSet(10, 51);
        System.out.println(set2);

        TreeSet<Pair> treeSet2 = new TreeSet<>((a, b) -> {
            if (a.first != b.first){
                return Integer.compare(a.first, b.first);
            }
            return Integer.compare(a.second, b.second);
        });

        treeSet2.add(new Pair(1,2));
        treeSet2.add(new Pair(2,3));
        treeSet2.add(new Pair(3,4));
        treeSet2.add(new Pair(1,1));

        treeSet2.remove(new Pair(1,2));
        Iterator itr2 = treeSet2.iterator();
        while(itr2.hasNext()){
            Pair pair = (Pair)itr2.next();
            System.out.println(pair.first + " " + pair.second);
        }
    }


}
