import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner x =new Scanner(System.in);
        int num = x.nextInt();

        int count =0;
        while(num > 0){
            int remainder = num%10;
            if (remainder == 3){
                count++;
            }
            num = num/10;
        }
        System.out.println("Number of occurence of 3 is: " + count);
    }
}
