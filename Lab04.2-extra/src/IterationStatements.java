public class IterationStatements {
    public static void main(String[] args) {
        int i = 4;
        while (i > 0) {
            System.out.println("i: " + i);
            i--;
        }

        int i2 = 1;
        do {
            System.out.println("i2: " + i2);
            i2--;
        } while (i2 > 0);

        for (int i3 = 0; i3 < 5; i3++){
            System.out.println("i3: " + i3);
        }

        for (int i4 = 5; i4 > 0; i4--) {
            System.out.println("i4: " + i4);
        }

        int[] nums = {1, 2, 3, 4, 5};
        for (int num: nums) {
            System.out.println(num);
        }

        String[] names = {"joe", "chris", "cheeseburger"};
        for (String name: names) {
            System.out.println(name);
        }
    }
}
