package oct24;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayOfInt_Level1 {

    static int[] ints3;
    static String myString;

    public static void main(String[] args) {


        //TODO: Exercise #1
        //How do you create an array of int with size of 10?
        int[] ints = new int[10];
        int x = 2;
        int y = 3;
        int[] ints1 = new int[x + y];
        int[] ints2 = new int[ints1.length];
        //int[] ints3;

        System.out.println(Arrays.toString(ints2));
        System.out.println(ints3);

        //create an array of String type but the elements are null
        String[] strings = new String[5];

        //TODO: Exercise #2
        //Let's say you have the following number: 3,9,6,3,1,10,5
        //How do you create an array of int?
        int[] ints4 = {3, 9, 6, 3, 1, 10, 5};
        System.out.println(Arrays.toString(ints4));

        //TODO: Exercise #3
        //Let's say you have an array of int initialized above
        //How do you find largest number
        int largestNumberFromInts4Array = ints4[0];
        //int largestNumberFromInts4Array2 = Integer.MIN_VALUE;
        for (int i = 0; i < ints4.length; i++) {
            if (largestNumberFromInts4Array < ints4[i]) {
                largestNumberFromInts4Array = ints4[i];
            }
        }

        System.out.println(largestNumberFromInts4Array);

        //TODO: Exercise #4
        //Let's say you have an array of int initialized above
        //Change each number in the array multiplied by 2
        for (int i = 0; i < ints4.length; i++) {
            ints4[i] *= 2;
        }
        System.out.println(Arrays.toString(ints4));

        int totalValue = 0;
        int currentIndex = 0;
        for (int value : ints4) {
            ints4[currentIndex++] *= 3;
        }
        System.out.println(Arrays.toString(ints4));
    }
}
