import java.util.Scanner;

public class Conditional {
    public static void main (String [] args){
        System.out.println("ENTER");
        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();
        int x = num/2;
        int count;
        int india =7;

        if (num==0 || num==1){
            System.out.println("Prime Number");
        }
        else{
            for (count=2; count<=x;count++){
                if (num%count==0){
                    india = 0;
                    break;
                }
            }

            if (india==0){
                System.out.println("Not Prime");
            }
            else {
                System.out.println("Prime");
            }
        }
        }


}
