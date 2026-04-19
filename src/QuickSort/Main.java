package QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 10, 1, 5, 6, 4, 3};

        QuickSort.quickSort(arr, 0, arr.length-1);
        for (int j:arr){
            System.out.print(j + " ");
        }
    }
}
