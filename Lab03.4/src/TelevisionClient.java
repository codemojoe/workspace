public class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        Television tv1 = new Television();

        tv1.setBrand("Toshiba");
        tv1.setVolume(50);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1);

        Television tv2 = new Television("Sony", Television.MIN_VOLUME);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);

        Television tv3 = new Television("LG");
        tv3.setVolume(Television.MAX_VOLUME);
        tv3.turnOn();
        tv3.turnOff();
        System.out.println(tv3);
        System.out.println(Television.getInstanceCount() + " instances");
    }
}
