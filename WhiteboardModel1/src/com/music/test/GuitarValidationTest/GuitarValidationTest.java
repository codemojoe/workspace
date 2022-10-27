package com.music.test.GuitarValidationTest;

import com.music.Guitar.Guitar;
import com.music.GuitarType.GuitarType;

public class GuitarValidationTest {
    public static void main(String[] args) {

        try {
            Guitar guitarCorrectValues = new Guitar("Gibson", 6, 38, GuitarType.ELECTRIC);
            Guitar guitarWrongValues = new Guitar();

            System.out.println("Guitar correct values: " + guitarCorrectValues);
            guitarWrongValues.tune();
            guitarWrongValues.tune();
            System.out.println();
            System.out.println("Guitar with wrong values: " + guitarWrongValues);
            //guitarWrongValues.setType(GuitarType.MADEUP);   //line made for testing incorrect GuitarType value
            guitarWrongValues.setType(GuitarType.CLASSICAL);
            guitarWrongValues.setBrand("Gibson");
            guitarWrongValues.setStrings(4);
            guitarWrongValues.setLength(46);
            guitarWrongValues.tune();
            System.out.println("Guitar with wrong values: " + guitarWrongValues); //values for Strings and Length revert to default
        }

        catch (IllegalGuitarException e) {
            System.out.println("  ERROR: " + e);
        }
    }
}
