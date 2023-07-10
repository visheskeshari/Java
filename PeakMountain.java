public class PeakMountain {
    public static void main (String[]args){
        int arr[] = {0,2,3,5,7,6,4,1};
        int target = 3;
    }

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/description/

    public int peakIndexInMountainArray(int[] arr) {
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
    }
