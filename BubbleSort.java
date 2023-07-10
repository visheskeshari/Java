import java.util.Arrays;

public class BubbleSort {

    public static void main (String [] args){
        int [] arr = {1,2,3,0,6,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int arr[]){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i -1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

}
