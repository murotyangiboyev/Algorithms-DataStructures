import java.util.ArrayList;
import java.util.List;

public class Bitmask {

    public static List<List<Integer>> bitmasking(int[] array){

        int length = array.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < (1 << length); i ++){
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < length; j ++){
                if ((i & (1 << j)) != 0){
                    subset.add(array[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}
