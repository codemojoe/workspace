public class WordCount {
    public static String inputString = "Hello I love Boston. Yes, you do Love Boston.";
    public static void main(String[] args) {
        WordCount.countWordsInArray(inputString);
    }
    static boolean isPresentinArray(String[] array, String str){
        for(int i=0; i<array.length; i++){
            if(str.equalsIgnoreCase(array[i])){
                return true;
            }
        }
        return false;
    }
    static void countWordsInArray(String stringRepresentationOfArray) {

        //System.out.println(stringRepresentationOfArray);
        //stringRepresentationOfArray = stringRepresentationOfArray.toLowerCase();
        String[] noPunctuation = stringRepresentationOfArray.split("[, ?.@]+") ;
        for(String s: noPunctuation){
            //System.out.println(s);
        }
        String[] wordsWithCount = new String[noPunctuation.length];
        int[] countArray = new int[noPunctuation.length];
        int counter = 1;
        int uniqueWords = 0;

        for(int i = 0; i < noPunctuation.length; i++) {
            for(int j = 1; j < noPunctuation.length; j++) {
                if (noPunctuation[i].equalsIgnoreCase(noPunctuation[j])) {
                    counter++;
                }
            }
            if(!isPresentinArray(wordsWithCount, noPunctuation[i])){
                countArray[uniqueWords] = counter;
                wordsWithCount[uniqueWords] = noPunctuation[i];
                uniqueWords++;
                //System.out.println(wordsWithCount[i] + ": " + counter);
            }
            //System.out.println(wordsWithCount[i] + ": " + counter);
            counter = 0;
        }
        for(int i = 0; i < wordsWithCount.length; i++) {
            System.out.println(wordsWithCount[i] + ": "+ countArray[i]);

        }

    }
}
