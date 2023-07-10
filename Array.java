import java.util.Scanner;

public class Array {
    public static void main (String [] args){
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            // arr[row] = new int[3]; // initialize inner array with desired length if you are  skipping this earlier like 'int[][] arr = new int[3][ ]';

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
