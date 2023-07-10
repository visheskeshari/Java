import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the digits: ");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int [] rev;
        rev = reverse(arr);

        for (int i = 0; i < rev.length ; i++) {
            System.out.print(rev[i]);
        }
    }

    static int[] reverse(int [] sub){
        int start = 0;
        int end = sub.length-1;
        while (start<end){
            int temp = sub[start];
            sub[start]= sub[end];
            sub[end] = temp;
            start++;
            end--;
        }
        return sub;
    }
}
