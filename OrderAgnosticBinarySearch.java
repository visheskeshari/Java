import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[]args){
        int [] arr = {323, 35, 6, 0, -3, -77, -87, -565, -57356};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int target = sc.nextInt();
        System.out.println(orbs(arr,target));
    }

    public static int orbs (int[]arr, int target){
        boolean check;
        int start = 0;
        int end = arr.length-1;
        // checking the order of sorting
        check = arr[start]<arr[end];


        while(end>=start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;

            if (check) {
                if (target < arr[mid]) end = mid - 1;
                else if (target > arr[mid]) start = mid + 1;
            }
            else {
                if (target > arr[mid]) end = mid - 1;
                else if (target < arr[mid]) start = mid + 1;
        }
        } return -1;
    }
}
