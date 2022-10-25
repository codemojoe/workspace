public class WrapperExample {
    public static int convertStringToIntPrimitive(String toBeConvertedString) {
        int stringConvertedToInt = Integer.parseInt(toBeConvertedString);
        return stringConvertedToInt;
    }

    public static int convertStringToIntegerObject(String toBeConvertedString) {
        Integer stringConvertedToIntObj = Integer.valueOf(toBeConvertedString);
        return stringConvertedToIntObj;
    }
}

