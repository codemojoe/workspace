public class MyNumber {

    public static double computeRandomInt(int start, int end) {
        int diff = end - start;
        int value = ((int) Math.floor((Math.random() * diff)) + start);
        return value;
    };
}
