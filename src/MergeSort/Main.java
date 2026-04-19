package MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 10, 4, 6, 2, 7};

        MergeSort.mergeSort(arr);
        for(int j : arr){
            System.out.print(j + " ");
        }

    }
}
