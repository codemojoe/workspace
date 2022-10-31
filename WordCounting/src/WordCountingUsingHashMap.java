import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountingUsingHashMap {


    public static void main(String[] args) {
        String inputString = "Hello I love Boston. Yes, you do Love Boston.";
        String[] words = inputString.toLowerCase().split("[, ?.@]+");
        //List<String> initialWords = Arrays.asList(words);
        Map<String, Integer> inputStringMap = new HashMap<>();

        for (String word : words) {
            if(inputStringMap.containsKey(word)) {
                inputStringMap.put(word, inputStringMap.get(word)+1);
            } else {
                inputStringMap.put(word, 1);
            }
        }
        System.out.println(inputStringMap);
    }
}

