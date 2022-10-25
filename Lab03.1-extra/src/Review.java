public class Review {

    private static int testInt;
    private static String testString;

    public static void main(String[] args) {
        testMethod();
    }

    private static void testMethod() {
        int anotherTestInt = 1;
        String anotherTestString = "Test";

        System.out.println("localInt " + anotherTestInt + " localString " + anotherTestString);
        System.out.println("field Int " + testInt + " field String " + testString);
    }
}
