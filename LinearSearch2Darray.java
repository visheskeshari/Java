import java.lang.String;
import java.util.Arrays;

public class LinearSearch2Darray {
    public static void main (String [] args){
        int [][] arr = {{1,2,3,4}, {45,6,53,234,54}, {90,93,123,42,33,44}, {11,23,14,49}};
        int target =234;

        int[]ans = search(arr,target);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] search (int [][] dew,int target){

        for (int row = 0; row < dew.length; row++) {
            for(int col = 0; col< dew[row].length; col++){
                if (dew[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
