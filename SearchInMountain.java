
// https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {

    public static void main (String[]args){
        int arr[] = {0,2,3,5,7,6,4,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    public static int search(int arr[], int target){
        int peak = peakIndexInMountainArray(arr);
        int ans = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(ans!= -1){
            return ans;
        } else {
            return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            int mid = start +(end-start)/2;

            if (arr[mid]>arr[mid+1]){
                // you are decreasing part of the array
                // this may be the answer but we should look left for more possibilities
                // that's why end != mid-1
                end = mid;
            } else //(arr[mid] < arr[mid+1]) {
                // we are in assending part of the array
                start = mid+1; // because mid+1 is already greater than mid, hence we ignore the mid
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    public static int orderAgnosticBinarySearch (int[]arr, int target, int start, int end){
        boolean check;
        // checking the order of sorting
        check = arr[start]<arr[end];

        while(end>=start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (check) {
                if (target < arr[mid]) end = mid - 1;
                else if (target > arr[mid]) start = mid + 1;
            }
            else {
                if (target > arr[mid]) end = mid - 1;
                else if (target < arr[mid]) start = mid + 1;
            }
        }
        return -1;
    }
}
