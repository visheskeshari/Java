import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = prime(sc.nextInt());
        if (a>1) System.out.println("not Prime");
        else System.out.println("Prime");
    }

    public static int prime(int a){
        int count=0;
        int i=2;
        while (i*i<a){
            if  (a%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
}
