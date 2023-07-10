import java.util.Scanner;

public class Floor {
    public static void main (String [] args){
        int [] arr = {-18, -4, 0, 5, 6, 12, 45, 67, 89, 233};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int target = sc.nextInt();
        System.out.println(binary(arr,target));
    }

    static int binary(int []arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(end>start){
            int mid = start + (end-start)/2;

            if (target < arr[mid]) end = mid-1;
            else if (target > arr[mid])  start = mid+1;
            else return mid;
        }
        return end;
    }
}
