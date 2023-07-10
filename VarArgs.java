import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(2,3,4,5,6,7,8);

        multiple(15, 2, "Vishes", "Keshari");
    }

    static void fun(int ... x){
        System.out.println(Arrays.toString(x));
    }

    static void multiple(int a, int b, String ... str){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(str));
    }
}
