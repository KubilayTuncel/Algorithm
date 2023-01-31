package MergeSort;

public class MergeSort {

    public static  void merge(int arr[], int left, int middle, int right) {


        int low = middle-left+1; // size of left sub-array
        int high = right - middle;

        int[] L = new int[low];
        int[] R = new int[high];

        int i = 0, j=0;

        for (; i<low; i++) { // soldaki alt-array e elemanlar kopyalandi.
            L[i] = arr[left+i];
        }
        for (;j<high;j++) { //sagdaki alt-array'e elemanlar kopyalaniyor.
            R[j] = arr[middle+1+j];
        }

        int k = left;
        i=0;
        j=0;

        while (i<low && j<high) { //sol ve sag alt arrayler merge islemi yapildi.

            if (L[i] <=R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<low) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<high){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int left, int right) {
        int middle;
        if (left<right) {
            middle = (left+right)/2;
            mergeSort(arr,left,middle); //sol alt-array
            mergeSort(arr,middle+1,right);
            merge(arr,left,middle,right); //sah ve sol alt arrayler birlestiriliyor(merge islemi yapiliyor)
        }
    }
}
