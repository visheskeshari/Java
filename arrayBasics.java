import java.util.Arrays;
import java.util.Scanner;

public class arrayBasics {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

//        int [] arr1 = new int[5];
//        int [] arr2 = {23,45,66,44,3};

        int [] arr3 = new int[9];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // OR

        for (int j : arr3) {
            System.out.println(j);
        }

        // OR

        System.out.println(Arrays.toString(arr3));

    }
}
