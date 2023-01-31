package BigO;

public class On { //O(n) ---> Linear Complexity
    //elimizdeki veri seti artikc, calistirma süresi de dogru orantili olarak artiyor.

    public static void main(String[] args) {
        int[] arr = {10,2,20,40,55,7};

        for (int item:arr
             ) {
            System.out.print(item + ", "); //6 islem yapiliyor.
        }
    }
}
