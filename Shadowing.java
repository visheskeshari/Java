public class Shadowing {
    static int a = 10;

    public static void main(String[] args) {
        int a = 20;
        {
            a = 40;

            System.out.println(a);

        }
        System.out.println(a);
        fun();
    }

    public static void fun(){
        System.out.println(a);
    }

}
