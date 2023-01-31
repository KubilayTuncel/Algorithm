package BigO;

public class On2 { // O(n^2) ---> !uadratic Complexity

    public static void main(String[] args) {
        int count = 0;

        int[] arr = {2,1,5};

        for (int i = 0; i< arr.length;i++) {
            for (int j = 0; j< arr.length;j++){
                System.out.print(arr[i]+arr[j]+", ");
                count++;
            }
        }

        System.out.println("");
        System.out.println("count : " + count);
    }
}
