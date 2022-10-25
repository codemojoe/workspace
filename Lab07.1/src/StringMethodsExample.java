import java.util.Arrays;

public class StringMethodsExample {
    public static void main(String[] args) {
        String testString = "Hello World";
        String testStringSame = "Hello World";
        String testStringDifferent = "hola mundo";

        boolean contains = testString.contains("Wor");
        boolean xyz = testString.contains("xyz");
        System.out.println(contains);
        System.out.println(xyz);

        boolean endsWithTrue = testString.endsWith("rld");
        boolean endsWithFalse = testString.endsWith("no");
        System.out.println("endsWithTrue: " + endsWithTrue);
        System.out.println("endsWithFalse: " + endsWithFalse);

        boolean equalsStringTrue = testString.equals(testStringSame);
        boolean equalsStringFalse = testString.equals(testStringDifferent);
        System.out.println("equalsStringTrue: " + equalsStringTrue);
        System.out.println("equalsStringFalse: " + equalsStringFalse);

        boolean equalsIgnoreCaseTrue = testString.equalsIgnoreCase(testStringSame);
        boolean equalsIgnoreCaseFalse = testString.equalsIgnoreCase(testStringDifferent);
        System.out.println("equalsIgnoreCaseTrue: " + equalsIgnoreCaseTrue);
        System.out.println("equalsIgnoreCaseFalse: " + equalsIgnoreCaseFalse);

        System.out.println("Index of testString l: " + testString.indexOf("l"));
        System.out.println("testString length: " + testString.length());

        String[] arrOfTestString = testString.split(" ");
        for (String i : arrOfTestString)
            System.out.println("splitTest: " + i);
        //System.out.println("testString split at space: " + arrOfTestString);

        System.out.println("startsWithTrue: " + testString.startsWith("H"));
        System.out.println("startsWithFalse: " + testString.startsWith("g"));

        String testStrip = "             hello world ";
        System.out.println("strip: " + testStrip.strip());

        System.out.println("substring World: " + testString.substring(5, 11));

        System.out.println("toLowerCase: " + testString.toLowerCase());
        System.out.println("toUpperCase: " + testString.toUpperCase());


        int[] ints = new int[10]; //all elements initialized 0
        String[] strings = new String[5]; //all elements with null
        //Person[] people = new Person[7]; //all elements with null

        ints[2] = 78;
        ints[0] = 78;
        ints[1] = 78;
        int length = ints.length;
        System.out.println("length of ints array: " + length);
        System.out.println("length of ints strings: " + strings.length);

        int[] ints1 = {2, 39, 49, 3};

//        readNames(ints1);
//        readNames(new int[] {5, 3, 10});

        String[] strings1 = {"Cindy", "Kiaya"};
        String[] strings2 = {"Cindy", "Kiaya"};

        System.out.println("result of toString():" + strings1.toString());
        System.out.println("result of using Arrays.toString(): " + Arrays.toString(strings1));

        boolean equalsStrings = strings1.equals(strings2);
        System.out.println("equals Strings: " + equalsStrings);
        boolean equalsStrings2 = (strings1 == strings2);
        System.out.println("equals Strings: " + equalsStrings2);

        boolean equals1 = Arrays.equals(strings1, strings2);
        System.out.println("Strings equals using Arrays.equals: " + equals1);

        //Computer[] computers = {new Computer("Sony"), new Computer("LG"), new Computer("Samsung")};
        //findByBrand(computers, "Samsung");
    }

//    public void wash(Car[] cars) {
//        for (Car c: cars) {
//            System.out.println(c);
//        }
//    }
//
//    class Car {
//    }

    public static void findByBrand(Computer[] computers, String brand) {
//        for (int i = 0; i < computers.length; i++) {
//            if (computers[i].getBrand().equals(brand)) {
//                System.out.println("found a " + brand + " at index " + i);
//            } //found a Lenovo at index 4
//        }
        boolean foundIt = false;

        int currentIndex = 0;
        while (foundIt == false) {
        if (computers[currentIndex++].getBrand().equals(brand)){
            System.out.println("We found it" + brand);
        foundIt = true;
            }
        }

        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand)) {
                System.out.println("We found it");
                break;
            }
        }
    }

class Computer {
    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

//    public static void readNames(int[] numbers) {
//
//    }
//}
//
//class Person{
//
}
