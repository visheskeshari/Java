import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main (String [] args){
        int [] nums = {-18, -4, 0, 5, 6,6,6,6,6, 12, 45, 67, 89, 233};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int target = sc.nextInt();
        int [] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {//for loop to print the array
            System.out.print( ans[i]+ " ");
        }

        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // find the index of target
    static int search(int[]nums,int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length;

        while(end>=start){
            int mid = start + (end-start)/2;

            if (target < nums[mid]) end = mid-1;
            else if (target > nums[mid])  start = mid+1;
            else {
                ans = mid;
                if(findStartIndex) end = mid-1;
                else start = mid+1;
            }
        }
        return ans;
    }
}
