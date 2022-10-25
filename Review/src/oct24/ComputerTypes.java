package oct24;

public enum ComputerTypes {
    PC, TABLET, PHONE, TV
}


class ComputerEnumTest {
    public static final int PC = 1;
    public static final int TABLET = 2;
    public static final int PHONE = 3;
    public static final int TV = 4;

    public static void main(String[] args) {

        //compiler won't find error (5 not in class)
        buyComputerMethodUsingPublicStaticFinalConstants(PC, 3);

        //compiler will highlight error if not in enum class
        buyComputerMethodUsingEnum(ComputerTypes.PC, 2);
    }

    public static void buyComputerMethodUsingPublicStaticFinalConstants(int computerType, int quantity) {
        System.out.println(computerType);
    }
    public static void buyComputerMethodUsingEnum(ComputerTypes computerTypes, int quantity) {
        System.out.println(computerTypes);
    }
}