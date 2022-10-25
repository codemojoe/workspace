public class IterationExamples {
    private double salary1 = 10.0;
    private Double salary2 = salary1;
    private String name;


}

enum FamilyMembers {
    CHEESE, ABBY, JOE;
}

class Main {
    private static int i1 = 1;
    private static  Integer i2 = 2;

    public static final String CHEESE = "Cheese";
    public static final String ABBY = "Abby";
    public static final String JOE = "Joe";

    public static final int JANUARY = 1;

    public static void main(String[] args) {
        //autoboxing: primitive > object
        i2 = i1;
        Integer myInteger = 2;

        //unboxing: object > primitive
        i1 = i2;
        int x = new Integer(3);

        familyMembersTest("Chris");
        methodTakesEnumValue(FamilyMembers.JOE);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int[] ints = {3, 4, 5, 6};
        for (int number : ints) {
            System.out.println(number);
        }
    }

    public static void familyMembersTest(String name) {
        System.out.println(name);
    }

    public static void methodTakesEnumValue(FamilyMembers myFamily) {
        System.out.println(myFamily);
    }
}
