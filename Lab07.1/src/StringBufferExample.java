public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer(100);
        s.append("20");

        //some business logic
        //then append

        StringBuffer whatever = s.append("whatever");

        String s1 = whatever.toString();

        String ssn = "077-23-0812";
        String zip = "10988-1223";
        String ref = "PQYZQI";

        boolean matchesSsn = ssn.matches("\\d{3}-\\d{2}-\\d{4}");
        boolean matchesZip = zip.matches("\\d{5}(-\\d{4})?");
        boolean matchesRef = ref.matches("[A-Z]{6}");
        System.out.println(matchesSsn);
        System.out.println(matchesZip);
        System.out.println(matchesRef);

    }
}
