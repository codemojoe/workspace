package oct24;

import java.util.Arrays;

public class ArrayOfInt_Level2 {
    public static void main(String[] args) {
        //TODO: Exercise #1
        //Lets say you have an array of int initialized with 3, 6, 9, 2, 1, 10, 5
        //Create another array of int where the numbers are sorted
        int[] ints = {3, 9, 6, 2, 1, 10, 5};
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    int larger = ints[i];
                    ints[i] = ints[j];
                    ints[j] = larger;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
