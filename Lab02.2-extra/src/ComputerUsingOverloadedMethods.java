class ComputerUsingOverloadedMethods {
    public int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int subtraction(int x, int y) {
        int difference = x - y;
        return difference;
    }

    public long add(long x, long y) {
        long sum = x + y;
        return sum;
    }

    public long subtraction(long x, long y) {
        long difference = x - y;
        return difference;
    }

    public int add(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
    return sum;
    }
}
