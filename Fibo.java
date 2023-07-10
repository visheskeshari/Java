import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("enter the n");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();

        int first = 0;
        int second = 1;
        int count = 2;
        int third = 0;

        while (count <= n){

            third = first+second;
            first = second;
            second = third;
            count++;
        }
        System.out.println(third);
    }
}
