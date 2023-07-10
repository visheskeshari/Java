import java.util.Scanner;

public class FindLargestNumber {
    public static void main (String [] args){
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

/*        if (a>b && a>c){
            System.out.println("A is greatest");
        } else if (b>a && b>c){
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }*/

/*        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max=c;
        }*/

        int max = Math.max((Math.max(a,b)),c);

        System.out.println(max + " is greatest");
    }
}
