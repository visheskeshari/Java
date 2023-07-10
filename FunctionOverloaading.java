import java.util.Arrays;

public class FunctionOverloaading {
    public static void main(String[] args) {
        vishes(15,2);
        vishes("Keshari");
        vishes(9);
        vishes(3,4,5,6);
    }

    public static void vishes(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void vishes(String a){
        System.out.println(a);
    }

    public static void vishes(int ... v){
        System.out.println(Arrays.toString(v));
    }
}
