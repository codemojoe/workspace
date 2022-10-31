import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCountingUsingArrayList {

    public static String inputString = "Hello I love Boston. Yes, you do Love Boston.";

    public static void main(String[] args) {
        WordCount.countWordsInArray(inputString);
    }

    List<String> initialWords = Arrays.asList(inputString);

    List<String> uniqueWords = new ArrayList<>();
    List<Integer> count = new ArrayList<>();

//    for (String word : initialWords) {
//        if(!uniqueWords.contains(word.toUpperCase())) {
//            uniqueWords.add(word.toLowerCase());
//            count.add(1);
//        }
//        else {
//            int numberOfOccurences = count.get(uniqueWords.indexOf(word.toLowerCase()));
//            numberOfOccurences++;
//            count.set(uniqueWords.indexOf(word.toLowerCase()), numberOfOccurences);
//        }
//    }
//    for (String word : uniqueWord) {
//        System.out.println(word + " : " + count.get(uniqueWords.indexOf(word)));
//    }

}

