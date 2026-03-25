import java.util.List;

class Main{
    public static void main(String[] args){

        // mergeSort
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        QuickSort.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // quicksort
        int[] array2 = {10, 4, 2, 5, 2 , 0, 4, 11};
        MergeSort.mergeSort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();


        // bitmasking
        int[] array3 = {4, 7, 1, 3};
        List<List<Integer>> result =  Bitmask.bitmasking(array3);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        } // printing all subsequences of the array
    }
}