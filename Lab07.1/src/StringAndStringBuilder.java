class StringAndStringBuilder {

    public static void main(String[] args) {
        System.out.println("My address with String: " + StringAndStringBuilder.constructMyAddressUsingString());
        System.out.println("My address with StringBuilder: " + StringAndStringBuilder.constructMyAddressUsingStringBuilder());
        System.out.println("Test using equals method: " + StringAndStringBuilder.constructMyAddressUsingString().equals(StringAndStringBuilder.constructMyAddressUsingStringBuilder()));
        System.out.println("Test using == comparison: " + StringAndStringBuilder.constructMyAddressUsingString() == StringAndStringBuilder.constructMyAddressUsingStringBuilder());
    }

    public static String constructMyAddressUsingString() {
        return "Wilson" + " " + "Avenue";
    }

    public static String constructMyAddressUsingStringBuilder() {
        StringBuilder myAddressStringBuilder = new StringBuilder(100);
        return myAddressStringBuilder.append("Wilson")
                .append(" ")
                .append("Avenue").toString();
    }
}
