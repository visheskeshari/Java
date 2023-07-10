import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,5,1,4,0,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int arr[]) {
        int currentIndex = 0;
        while(currentIndex < arr.length) {
            int value = arr[currentIndex];
            int valueIndex = value - 1;
            if (value != currentIndex-1) {
                swap(arr, currentIndex, valueIndex);
            } else {
                currentIndex++;
            }
        }
    }

    public static void swap (int[] arr, int currentIndex, int value){
        int temp = arr[value];
        arr[value] = arr[currentIndex];
        arr[currentIndex] = temp;
    }
}