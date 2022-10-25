public class MyMathClient {
    public static void main(String[] args) {
        MyMath myMath = new MyMath(30);
        int randomIntX = 20;
        int randomIntY = 40;

        System.out.println(MyMath.min(randomIntX, randomIntY));
        System.out.println(MyMath.max(randomIntX, randomIntY));

        System.out.println("The age is within your range: " + MyMath.isAgeInRange(myMath.age));
    }
}
