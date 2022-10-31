package CollectionsVersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    List<String> friends = new ArrayList<>();
    //String[] myFamily = {"Abby", "Cheeseburger", "Joe"};

    public void addFriends(List<String> name) {
        friends.add("Joe");
        friends.add("Abby");
        friends.add("Cheeseburger");
    }
    public void convertAndDisplayNamesToUpperCase(List<String> friends){
        //friends = addFriends();
        int i = 0;
        for (String friend : friends) {
            friends.set(i++, friend.toUpperCase());
        }
        System.out.println(friends);
    }

//    public List<String> addFriends() {
//    }

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

    public void findLargestNumberFromArray(List<Integer> numbers) {
        numbers.removeIf(i -> i % 2 == 0);
        System.out.println(numbers);
    }

    public static void myVarsMethod(ArrayList<Integer> numbers) {
        int largestNum = numbers.get(0);
        for (Integer num : numbers) {
            if ( num > largestNum) {
                largestNum = num;
            }
        }
        System.out.println(largestNum);
    }
}

class Main{
    static int[] oddNumbers = {1,2,3,4,5,6,7,8,9};
    static int[] largestNumber = {8,3,2,1,4,5,6,10,8,2,3};
    static String[] myFriends = {"Joe", "Cheese", "Chris"};
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        //arrayExample.convertAndDisplayNamesToUpperCase();
        int[] oddNumbersFromArray = ArrayExample.findOddNumbersFromArray(oddNumbers);

        String toString = Arrays.toString(oddNumbersFromArray);
        System.out.println("Odd numbers: " + toString);

        //System.out.println("Largest: " + ArrayExample.findLargestNumberFromArray(largestNumber));

        String name = args[0];
        String friend = args[1];
        //ArrayExample.myVarsMethod(name, friend);
        //ArrayExample.myVarsMethod("Joe", "Chris", "Cheese");
        //ArrayExample.myVarsMethod("Joe", "Chris", "Cheese", "Abby");
    }


}
