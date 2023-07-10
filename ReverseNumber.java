import java.util.Scanner;

public class ReverseNumber {
    public static void main (String[]args){
        System.out.println("Enter the number");
        Scanner x = new Scanner(System.in);

        int num = x.nextInt();
        int temp = 0;
        int count = 0;
        while (num > 0){
            int remainder = num % 10;
            temp = remainder + (temp*10);
            num = num/10;
        }
        System.out.println("Reverse of the number is: " + temp);
    }
}
