package com.music.Guitar;

import com.music.GuitarType.GuitarType;
import com.music.test.GuitarValidationTest.IllegalGuitarException;

public class Guitar {
    public static final int MIN_STRINGS = 6;
    public static final int MAX_STRINGS = 12;
    public static final int MIN_LENGTH = 36;
    public static final int MAX_LENGTH = 42;
    public static final String[] VALID_BRANDS = {"Fender", "Gibson", "Ibanez", "Yamaha"};

    GuitarType type = GuitarType.ACOUSTIC;
    private String brand;
    private int strings = 6;
    private int length = 38;
    private boolean isTuned = false;

    public Guitar() {
    }

    public Guitar(String brand) {
        this();
        setBrand(brand);
    }

    public Guitar(String brand, int strings, int length, GuitarType type) throws IllegalGuitarException{
        this(brand);
        setStrings(strings);
        setLength(length);
        setType(type);
    }

    public void tune() {
        if (isTuned()) {
            System.out.println("Your guitar is already tuned.");
        } else {
            performTuning();
        }
    }

    public void performTuning() {
        isTuned = true;
        System.out.println("You tune your guitar. Your guitar is now tuned.");
    }

    public boolean isTuned() {
        return isTuned;
    }

    public void setTuned(boolean tuned) {
        isTuned = tuned;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }

    public GuitarType getType() {
        return type;
    }

    public void setBrand(String brand) {
        for (int i = 0; i < VALID_BRANDS.length; i++) {
            if (VALID_BRANDS[i].equalsIgnoreCase(brand)) {
                this.brand = brand;
                break;
            }
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setStrings(int strings) throws IllegalGuitarException {
        if (strings < MIN_STRINGS || strings > MAX_STRINGS) {
            throw new IllegalGuitarException("Invalid input. Strings must be between 6-12");
        } else {
            this.strings = strings;
        }
    }

    public int getStrings() {
        return strings;
    }

    public void setLength(int length) throws IllegalGuitarException {
        if (length < MIN_LENGTH || length > MAX_LENGTH) {
            throw new IllegalGuitarException("Invalid input. Length must be between 36-42");
        } else {
            this.length = length;
        }
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Guitar: \n"  +
                "Brand: '" + brand + '\'' +
                ", Strings: " + strings +
                ", Length: " + length +
                ", IsTuned: " + isTuned +
                " Type: " + type;
    }
}
