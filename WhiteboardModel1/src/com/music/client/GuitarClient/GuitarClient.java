package com.music.client.GuitarClient;

import com.music.Guitar.Guitar;
import com.music.GuitarType.GuitarType;

public class GuitarClient {
    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        Guitar guitar1 = new Guitar("Fender");
        Guitar guitar2 = new Guitar("Gibson", 6, 38, GuitarType.ELECTRIC);

        System.out.println(guitar);
        guitar.setType(GuitarType.CLASSICAL);
        guitar.setBrand("Ibanez");
        guitar.setStrings(6);
        guitar.setLength(38);
        guitar.tune();
        System.out.println(guitar);

        System.out.println();

        System.out.println(guitar1);
        guitar.setType(GuitarType.ACOUSTIC);
        guitar.setStrings(8);
        guitar.setLength(40);
        guitar1.tune();
        guitar1.tune();
        System.out.println(guitar1);

        System.out.println();

        System.out.println(guitar2);
        guitar2.tune();
        System.out.println(guitar2);
    }
}

