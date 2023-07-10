public class WealthiestMan {
    public static void main (String [] args){
        int [][] bank = {{1,2,3},{4,5,6}};
        System.out.println(wealthy(bank));
    }
    static int wealthy(int [][] bank){
        int max =0;

        for (int person = 0; person < bank.length; person++) {
            int amount=0;
            for (int account = 0; account < bank[person].length; account++) {
                amount = amount + bank[person][account];
            }
            if (amount>max){
                max = amount;
            }
        }
        return max;
    }
}
