package oct24;

import java.util.Arrays;

public class ArrayOfString_Level1 {
    public static void main(String[] args) {


        //TODO: Exercise #1
        //Let's say you have an array of String with a size of 10
        //Assign names of your family members to the array
        //Display the array using Array.toString(...) method

        String[] familyMembers = new String[10];
        familyMembers[0] = "Dan";
        familyMembers[1] = "Mary";
        familyMembers[2] = "Tom";
        System.out.println(Arrays.toString(familyMembers));

        //TODO: Exercise #2
        //Create any array of String with the following String values
        //"2", "40", "7", "5"
        //Create a new array of int from the array
        //Display both arrays
        String[] intStrings = {"2", "40", "7", "5"};
        int[] stringToInt = new int[intStrings.length];
        for (int i = 0; i < intStrings.length; i++) {
            stringToInt[i] = Integer.parseInt(intStrings[i]);
        }
        System.out.println(Arrays.toString(intStrings));
        System.out.println(Arrays.toString(stringToInt));
        System.out.println(intStrings.getClass().getSimpleName());
        System.out.println(stringToInt.getClass().getComponentType());

        //TODO: Exercise #3
        //Create array of String called "myStringArrayA" with 2 words in order: "Hello", "Boston"
        //Create new array of String called "myStringArrayB" with two words in order: "Hello", "Boston"
        //Create new array of String called "myStringArrayC" with 2 words in order: "Boston", "Hello"
        //Check equality of two arrays of A and B
        //Check equality of two arrays of A and C
        String[] myStringArrayA = {"Hello", "Boston"};
        String[] myStringArrayB = {"Hello", "Boston"};
        String[] myStringArrayC = {"Boston", "Hello"};

        boolean equals = myStringArrayA == myStringArrayB;
        System.out.println(equals);

        boolean equals1 = myStringArrayA.equals(myStringArrayB);
        System.out.println(equals1);

        boolean equals2 = Arrays.equals(myStringArrayA, myStringArrayB);
        System.out.println(equals2);

        boolean equals3 = Arrays.equals(myStringArrayA, myStringArrayC);
        System.out.println(equals3);

    }
}
