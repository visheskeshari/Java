import java.util.Arrays;

public class SelectionSort {
    public static void main(String[]args){
        int [] arr =  {-2,-1,0,3,4,1,2,-22,-56};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, last);
            swap(arr, max, last);
        }
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int arr[], int end){
        int maxIndex = 0;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
