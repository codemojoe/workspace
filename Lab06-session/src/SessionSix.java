public class SessionSix {

}

class Main {
    public static void main(String[] args) {
        String msg = "hello";
        String anotherStringObject = msg.toUpperCase();
        System.out.println(msg);
        System.out.println(anotherStringObject);

        String msg1 = new String("hello");
        String msg2 = new String("hello");
        boolean equals = msg1.equals(msg2);
        boolean b = msg1 == msg2;
        System.out.println(b);
        System.out.println(equals);

        boolean he = msg1.startsWith("he");
        System.out.println(he);
    }
}
