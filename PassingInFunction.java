import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        System.out.println("Enter the details");
        Scanner sc = new Scanner(System.in);
        String [] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]= sc.next();
        }
        fun(str);
        System.out.println(Arrays.toString(str));

    }

    public static String fun(String[] str){
        str[3]= "Chandauli";
        return str[3];
    }
}
