public class SwapInArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 6, 7};

        swap(arr, 1, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void swap (int[]arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
