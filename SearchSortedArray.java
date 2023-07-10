import java.util.Arrays;

public class SearchSortedArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int target = 8;
        int[] res  = search(arr , target);
        System.out.println(Arrays.toString(res));
    }
    static int[] search(int [][] mat , int target){
        int i=0;
        int j = mat[0].length-1;
        while(i< mat.length && j>=0){
            if(mat[i][j] == target){
                return  new int[]{i,j};
            }
            if(target < mat[i][j]){
                j--;
            } else {
                i++;
            }
        }
        return  new int[]{-1,-1};
    }
}
