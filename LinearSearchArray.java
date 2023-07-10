import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int target = sc.nextInt();

        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search (int [] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
