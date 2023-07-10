public class CountEVENnumbers {
    public static void main(String[] args) {
        int [] arr= {2,22,222,2222,22222,222222,2222222, 22222222, 222222222, -222222, 00};
        int countEvnNo = passElement(arr);
        System.out.println("no. of elements containing even number of digits are: " + countEvnNo);
    }

    // check whether the number of elements contains even number of digits or not
    static int passElement (int arr []){
        int countEvenNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            int countLengthof = countLength(arr[i]);
            if (countLengthof%2==0){
                countEvenNumber++;
            }
        }
        return countEvenNumber;
    }


// count number of digits in an element
    static int countLength (int element){
        if (element<0){
            element=element*(-1);
        }
        int count = 0;
        while(element>0){
            element=element/10;
            count++;
        }
        return count;
    }
}
