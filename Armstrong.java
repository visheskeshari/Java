public class Armstrong {
    public static void main(String [] args){
        int number = 153;     // examples: 0, 1, 153, 370, 371 and 407
        System.out.println(fun(number));
    }

    public static int fun (int num){
        int sum = 0;
        int cube = 0;
        for (int i = 0; i < num; i++) {
            int left = num%10;
            cube = left*left*left;
            sum = sum + cube;
            num=num/10;
        }
        return sum;
    }
}
