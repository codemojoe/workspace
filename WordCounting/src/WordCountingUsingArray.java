

public class WordCountingUsingArray {
    public static void main(String[] args) {

        String initialSentence = "I love Boston. Yes you love Boston.";

        String[] initialWords = initialSentence.split("[, ?.@]+");

        String[] uniqueWords = new String[initialWords.length];
        int[] counters = new int[initialWords.length];
        //int[] counters = new int[initialWords.length];
        int currentIndex = 0;

        for (int i = 0; i < initialWords.length; i++) {
            //I need to know
            // if initialWords[i] is already found
            //-then I need to know the index of the location where the previous word is located
            //-and increment the counter in the counters array with the same index
            // else
            //-use currentIndex to set uniqueWords[currentIndex] = initialWords[i]
            //-counters[currentIndex] = 1
            String initialWord = initialWords[i];
            int foundIndex = isThisWordAlreadyFound(uniqueWords, initialWord, currentIndex);
                //If the word has been already encountered
            if (foundIndex >= 0) {
                counters[foundIndex]++;
                //else - this is the first the word is encountered
            } else {
                uniqueWords[currentIndex] = initialWord;
                counters[currentIndex] = 1;
                currentIndex++;
            }
        }

        for (int i = 0; i < currentIndex; i++){
            System.out.println(uniqueWords[i] + " " + counters[i]);
        }
    }

    private static int isThisWordAlreadyFound(String[] uniqueWords, String initialWord, int currentIndex) {
        int foundIndex = -1;
        for (int i = 0; i < currentIndex; i++)
            if (uniqueWords[i].equalsIgnoreCase(initialWord)) {
                foundIndex = i;
                break;
            }
        return foundIndex;
    }
}

