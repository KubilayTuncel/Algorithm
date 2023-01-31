package InsertionSort;

import SelectionSort.SelectionSort;

import java.util.Arrays;

public class insertionSortRunner {
    public static void main(String[] args) {


        int[] arr = {7,4,5,9,8,2,1};
        System.out.println("Sort islemi öncesi array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sort islemi sonrasi array : ");
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
