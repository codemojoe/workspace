package oct24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOfString_Level2 {

    public static void main(String[] args) {

        //TODO: Exercise #1
        //Create array of STring by using "split" method
        //from "I love Boston. Yes you do love Boston."
        //Display
        String initializeString = "I love Boston. Yes, you do love boston.";
        String[] stringArray = initializeString.split("[, ?.@&$]+");



        //TODO: Exercise #2
        //Create new array of String with unique word ( but case-insensitive manner) from
        //array of String that was created above. Resulting array should all be lower-case
        //In other words, the new array should contain "i", "love", "boston", "yes", do" as it's
        //element values
        //Display
        String[] uniqueWordsArray = new String[stringArray.length];
        int currentIndex = 0;
        //String[] lowerCased = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            boolean theWordAlreadyEncountered
                    = isTheWordAlreadyEncountered(stringArray[i]
                    , uniqueWordsArray
                    , currentIndex);
//            if (!theWordAlreadyEncountered) {
//                continue;
//            } else {
//                uniqueWordsArray[currentIndex++] = stringArray[i];
//            }
//        }
            if (!theWordAlreadyEncountered) {
                uniqueWordsArray[currentIndex++] = stringArray[i];
            }
        }

        for (int i = 0; i < currentIndex; i++) {
            System.out.print(uniqueWordsArray[i] + " ");
        }
        System.out.println();



        //TODO: Exercise #3
        //Create array of "char" from String "Life is good"
        //Display
        String initializeString1 = "Life is good";
        char[] chars = new char[initializeString1.length()];
        for(int i = 0; i < initializeString1.length(); i++) {
            chars[i] = initializeString1.charAt(i);
        }
        System.out.println(Arrays.toString(chars));

//        char[] splitArray = initializeString1.toCharArray();
//        System.out.println(Arrays.toString(splitArray));

//        String[] charsFromString = initializeString1.split("(?!^)");
//        System.out.println(Arrays.toString(charsFromString));

    }

    private static boolean isTheWordAlreadyEncountered(String wordToFind
            , String[] uniqueWordsArray
            , int currentIndex) {
        boolean found = false;
        for(int i = 0; i < currentIndex; i++) {
            if (uniqueWordsArray[i].equalsIgnoreCase(wordToFind)) {
                found = true;
            }
        }


        return found;
    }
}
