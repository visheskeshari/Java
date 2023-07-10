import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class ArrayListsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(1);

        list.add(0,2);
        list.add(1,56);
        list.add(2,2);
        list.add(3,56);
        list.add(4,56);
        list.add(5,2);
        list.add(6,56);
        list.add(7,2);
        list.add(8,56);
        list.add(9,2);
        System.out.println(list);

        list.set(5,234);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
