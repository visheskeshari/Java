import org.w3c.dom.ls.LSOutput;

public class InfiniteArray {

    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,67,78,89,90,123,234,345,456,567,6768,789,890,900};
        int target = 234;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        //first find the range
        //start with the size of box as 2
        int start = 0;
        int end = 1;

        // condition : if the target is greater than the end, then update the box size
        while (target > arr[end]) {
            int temp = end + 1;
            // double the size of the box
            // new end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
//    int  start = 0;
//    int end = arr.length -1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
