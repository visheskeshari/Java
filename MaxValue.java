public class MaxValue {
    public static void main(String[] args) {
        int [] arr = {23, 45 , 56 , 5654, 63456 ,36, 8};

        System.out.println(max(arr));
    }

    static int max (int[]viz){
        int mvalue = viz[0];
        for (int j : viz) {
            if (j > mvalue) {
                mvalue = j;
            }
        }
        return mvalue;
    }
}
