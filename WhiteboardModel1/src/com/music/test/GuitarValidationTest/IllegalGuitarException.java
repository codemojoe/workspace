package com.music.test.GuitarValidationTest;

public class IllegalGuitarException extends Exception{
    public IllegalGuitarException() {
    }

    public IllegalGuitarException(String message) {
        super(message);
    }

    public IllegalGuitarException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalGuitarException(Throwable cause) {
        super(cause);
    }
}
