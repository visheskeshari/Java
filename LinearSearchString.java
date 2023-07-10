import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = new String();
        str = sc.next();
        System.out.println("Enter the character you want to search: ");
        char target = sc.next().charAt(0);

        boolean ans = search(str, target);
        System.out.println(ans);
    }

    static boolean search (String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == target){
                return true;
            }
        }
        return false;
    }
}
