import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimentionalArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <ArrayList<Integer>> vishes = new ArrayList<>(8);

        for (int i = 0; i < 9; i++) {
            vishes.add(new ArrayList<>()); // adding arraylists in arraylist
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                vishes.get(i).add(sc.nextInt());
            }
        }

//        for (int j = 0; j < 5; j++) {
//            vishes.get(j).add(sc.nextInt());
//        }


        System.out.println(vishes);
    }
}
