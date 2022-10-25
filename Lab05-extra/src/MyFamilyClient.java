import java.util.EnumSet;

public class MyFamilyClient {
    public static void main(String[] args) {
        for (MyFamily f : MyFamily.values()) {
            System.out.println("My family values(): " + f);
        }

        for (MyFamily f : EnumSet.range(MyFamily.ABBY, MyFamily.CHEESEBURGER)) {
            System.out.println("My family EnumSet: " + f);
        }
    }
}
