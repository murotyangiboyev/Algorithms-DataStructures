package Bitmask;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array3 = {4, 7, 1, 3};
        List<List<Integer>> result =  Bitmask.bitmasking(array3);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
