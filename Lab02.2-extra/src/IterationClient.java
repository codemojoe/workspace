public class IterationClient {
    public static void main(String[] args) {
        Iteration iteration = new Iteration();
        int start = 1;
        int end = 7;
        iteration.displayNumbersUsingForLoop(start, end);
        iteration.displayNumbersUsingWhile(start, end);
        iteration.displayNumbersUsingDoWhile(start, end);
        iteration.displayEvenNumbersOnlyUsingForLoop(start ,end);
    }
}
