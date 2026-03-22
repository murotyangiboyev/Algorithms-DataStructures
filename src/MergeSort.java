import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array){
        int length = array.length;
        if (length <= 1) return ;
        int middle = length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, l = 0, r = 0;

        while (l <  leftLength && r < rightLength){
            if (leftArray[l] <  rightArray[r]){
                array[i] = leftArray[l];
                i ++; l ++;
            }else {
                array[i] = rightArray[r];
                i ++; r ++;
            }
        }
        while (l < leftLength){
            array[i] = leftArray[l];
            i ++; l ++;
        }
        while (r < rightLength){
            array[i] = rightArray[r];
            i ++; r ++;
        }
    }
}
