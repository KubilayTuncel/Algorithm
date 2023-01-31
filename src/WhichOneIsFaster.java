import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {

    public static void main(String[] args) {

        int[] siraliDizi = createOrderArray(1000000);
        int[] arr = createArray(10000000);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOf(arr,arr.length);
        int[] arr5 = Arrays.copyOf(arr,arr.length);
        int[] arr6 = Arrays.copyOf(arr,arr.length);

        long startTime;
        long endTime;
        double estimetedTime;

        //InsertionSort
        startTime=System.currentTimeMillis();
        //InsertionSort.insertionSort(arr);
        InsertionSort.insertionSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimetedTime=(double) (endTime-startTime)/1000;
        System.out.println("InsertionSort = "+estimetedTime);

        //SelectionSort
        startTime=System.currentTimeMillis();
        //SelectionSort.selectionSort(arr2);
        SelectionSort.selectionSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimetedTime=(double) (endTime-startTime)/1000;
        System.out.println("SelectionSort = "+estimetedTime);



        //MergeSort
        startTime=System.currentTimeMillis();
        //MergeSort.mergeSort(arr3,0,arr4.length-1);
        MergeSort.mergeSort(siraliDizi,0,siraliDizi.length-1);
        endTime=System.currentTimeMillis();
        estimetedTime=(double) (endTime-startTime)/1000;
        System.out.println("MergeSort = "+estimetedTime);
/*
        //QuickSort
        startTime=System.currentTimeMillis();
        //QuickSort.quickSort(arr4,0,arr4.length-1);
        QuickSort.quickSort(siraliDizi,0,siraliDizi.length-1);
        endTime=System.currentTimeMillis();
        estimetedTime=(double) (endTime-startTime)/1000;
        System.out.println("QuickSort = "+estimetedTime);

 */

        //ShellSort
        startTime=System.currentTimeMillis();
        //ShellSort.shellSort(arr5);
        ShellSort.shellSort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimetedTime=(double) (endTime-startTime)/1000;
        System.out.println("ShellSort = "+estimetedTime);

        //Arrays.sort()
        startTime=System.currentTimeMillis();
        //Arrays.sort(arr6);
        Arrays.sort(siraliDizi);
        endTime=System.currentTimeMillis();
        estimetedTime=(double) (endTime-startTime)/1000;
        System.out.println("Arrays.Sort = "+estimetedTime);


    }

    public static int[] createArray(int elemanSayisi) {
        int[] arr = new int[elemanSayisi];
        Random rm = new Random();

        for (int i=0; i< arr.length;i++) {
            arr[i] = rm.nextInt(10000);
        }
        return arr;
    }

    public static int[] createOrderArray(int elemanSayisi) {
        int[] arr = new int[elemanSayisi];

        for (int i=0;i<arr.length;i++) {
            arr[i]=i;
        }

        return arr;
    }
}
