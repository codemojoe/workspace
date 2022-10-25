package oct24;

import java.util.Arrays;

public class AutoboxingExamples {

    public static void main(String[] args) {
        //example of auto-boxing
        Integer[] myIntegerArray = {1, 2, 3, 4, 5, 6};

        //example of unboxing
        int[] myIntArray = new int[myIntegerArray.length];
        for(int i = 0; i < myIntegerArray.length; i++) {
            myIntArray[i] = myIntegerArray[i];
        }

        System.out.println(Arrays.toString(myIntArray));
    }
}
