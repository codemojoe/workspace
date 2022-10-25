import java.util.Arrays;
import java.util.Locale;

public class ArrayExample {
    String[] myFamily = {"Abby", "Cheeseburger", "Joe"};

    public void convertAndDisplayNamesToUpperCase(){
        for (int i = 0; i < myFamily.length; i++) {
            System.out.println(myFamily[i].toUpperCase());
        }
    }

    public static int[] findOddNumbersFromArray(int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }

        int[] oddNumbers = new int[count];
        for (int i = 0, j =0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0) {
                oddNumbers[j++] = numbers[i];
            }
        return oddNumbers;
    }

    public static int findLargestNumberFromArray(int[] numbers) {
        int largest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void myVarsMethod(String name, String...friends) {
        for (String friend : friends) {
            System.out.print(friend.toUpperCase() + " ");
        }
    }
}

class Main{
    static int[] oddNumbers = {1,2,3,4,5,6,7,8,9};
    static int[] largestNumber = {8,3,2,1,4,5,6,10,8,2,3};
    static String[] myFriends = {"Joe", "Cheese", "Chris"};
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        arrayExample.convertAndDisplayNamesToUpperCase();
        int[] oddNumbersFromArray = ArrayExample.findOddNumbersFromArray(oddNumbers);

        String toString = Arrays.toString(oddNumbersFromArray);
        System.out.println("Odd numbers: " + toString);

        System.out.println("Largest: " + ArrayExample.findLargestNumberFromArray(largestNumber));

        String name = args[0];
        String friend = args[1];
        ArrayExample.myVarsMethod(name, friend);
        //ArrayExample.myVarsMethod("Joe", "Chris", "Cheese");
        //ArrayExample.myVarsMethod("Joe", "Chris", "Cheese", "Abby");
    }


}
