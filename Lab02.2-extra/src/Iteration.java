public class Iteration {
    public void displayNumbersUsingForLoop(int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println("For Loop: " + i);
        }
    }

    public void displayNumbersUsingWhile(int start, int end) {
            while (start < end) {
                System.out.println("While Loop: " + start);
                start++;
            }
    }

    public void displayNumbersUsingDoWhile(int start, int end) {
            do {
                System.out.println("Do While Loop: " + start);
                start++;
            } while (start < end);
    }

    public void displayEvenNumbersOnlyUsingForLoop(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.println("Only Even: " + i);
            }
        }
    }

}
