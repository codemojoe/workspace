package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();

        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1);

        tv2.setBrand("Sony");
        tv2.setVolume(10);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);

        Television tv3 = new Television("Toshiba") {};
        tv3.setDisplay(DisplayType.PLASMA);
        System.out.println(tv3);

        Television tv4 = new Television("Dell", 50, DisplayType.OLED) {};
        System.out.println(tv4);
    }
}




