public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setBrand("Toshiba");
        tv1.setVolume(10);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1);

        Television tv2 = new Television("Sony", 30);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);

        Television tv3 = new Television("LG");
        tv3.setVolume(20);
        tv3.turnOn();
        tv3.turnOff();
        System.out.println(tv3);
    }
}
