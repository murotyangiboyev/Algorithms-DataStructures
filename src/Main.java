import HeapSort.HeapSort;

import java.util.List;

class Main{
    public static void main(String[] args){

        // mergeSort
//        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
//        QuickSort.QuickSort.quickSort(array, 0, array.length - 1);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        // quicksort
//        int[] array2 = {10, 4, 2, 5, 2 , 0, 4, 11};
//        MergeSort.MergeSort.mergeSort(array2);
//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i] + " ");
//        }
//        System.out.println();
//
//
        // bitmasking


        int[] arr = {5, 1, 10, 4, 6, 2, 7};
        HeapSort.heapSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}