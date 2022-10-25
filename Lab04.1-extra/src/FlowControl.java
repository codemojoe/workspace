public class FlowControl {
    public static boolean isItEvenNumber(int number) {
        return (number % 2 == 0);
    }

    public static int hexCharToDecimal(char hexChar) {
        int hexNum;
        switch (hexChar) {
            case 'A':
                hexNum = 10;
                break;
            case 'B':
                hexNum = 11;
                break;
            case 'C':
                hexNum = 12;
                break;
            case 'D':
                hexNum = 13;
                break;
            case 'E':
                hexNum = 14;
                break;
            case 'F':
                hexNum = 15;
                break;
            default:
                hexNum = hexChar - '0';
        }
        return hexNum;
    }
}
