import java.util.Arrays;

public class BSin2Darray {
    public static void main(String[]args){
        int arr[][] = {
                {1, 4, 5, 6},
                {10, 40, 50, 60},
                {100, 400, 500, 600},
                {1000, 4000, 5000, 6000}
        };
        System.out.println(Arrays.toString(search(arr,50)));
    }

    public static int []search (int matrix[][], int target){
        int row = 0 ;
        int col = matrix.length-1;

        while (row <matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            } else if (matrix[row][col] < target){
                row++;
            } else {
                col--;
            }
        } return new int[]{-1,-1};
    }
}
