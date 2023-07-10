import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().trim().charAt(0);

        if (a>='a' &&  a<= 'z'){
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }
    }
}
