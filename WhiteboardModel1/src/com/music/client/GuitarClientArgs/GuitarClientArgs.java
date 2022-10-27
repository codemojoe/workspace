package com.music.client.GuitarClientArgs;

import com.music.Guitar.Guitar;
import com.music.GuitarType.GuitarType;
import com.music.test.GuitarValidationTest.IllegalGuitarException;

public class GuitarClientArgs {

    public static void main(String[] args) throws IllegalGuitarException {

        try {
            if (args.length < 4) {
                String usage = "Usage: <brand> <strings> <length> <type> ";
                String example = "Example: Yahama 26 38 CLASSICAL";
                String note = "Note: supported types are CLASSICAL, ACOUSTIC, ELECTRIC";
                System.out.println(usage);
                System.out.println(example);
                System.out.println(note);
                return;
            }

            System.out.println("You provided " + args.length + " arguments");

            String brand = args[0];
            int strings = Integer.parseInt(args[1]);
            int length = Integer.parseInt(args[2]);
            GuitarType type = GuitarType.valueOf(args[3]);

            Guitar guitar1 = new Guitar(brand, strings, length, type);
            System.out.println(guitar1);
        } catch (IllegalGuitarException e) {
            System.out.println("  ERROR: " + e);
        }
    }


}