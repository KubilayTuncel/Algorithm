package BigO;

public class O1 { //O(1) --> constant Complexity (sabit süreli complexity)


    public static void main(String[] args) {
        int[] arr = {10,2,20,40,55,7};
        //task :  arrayin son elemenini ekrana basin
        System.out.println(arr[arr.length-1]);//tek circle da islemi cözdügü icin O(1) Constant Comp.

        //task :  verilen bir sayinin cift olup olmama durumu
        int x = 24;

        if (x%2==0) System.out.println("cift"); // O(1)
    }
}
