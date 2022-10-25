package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(1000);
        tv.setBrand("Mario");
        System.out.println(tv);

        Television tv1 = new Television();
        tv1.setVolume(10);
        tv1.setBrand("Sony");
        tv1.toggleMute();
        tv1.toggleMute();
        //tv1.mute();
        tv1.setVolume(50);
        tv1.toggleMute();
        System.out.println(tv1);
    }
}
