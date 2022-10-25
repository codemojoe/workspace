/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Client {

    // you can run each of these independently, by uncommenting the one you want
    public static void main(String[] args) {
         passByValue();
         passByReference();
    }

    private static void passByValue() {
        int x = 4;
        System.out.println("Client: before the call, x is " + x);

        // create Instructor and tell it to double my value
        Instructor instructor = new Instructor();
        instructor.doubleIt(x);

        System.out.println("Client: after the call, x is " + x);
    }

    private static void passByReference() {
        Marker m1 = new Marker("red");
        System.out.println("Client: before the call, the marker is " + m1.getColor());

        // create Instructor and tell it to write on board, with the Marker I pass in
        Instructor instructor = new Instructor();
        instructor.writeOnBoard(m1, "pass by reference");

        System.out.println("Client: after the call, the marker is " + m1.getColor());
    }
}

class Person {
    private int x = 5;
    private String name = "joe";

    public int someMethod(int argument) {
        var counter = 0;
        for (int i = 0; i < argument; i++){
            System.out.println(i);
            name = name.toUpperCase();
            counter++;
        }
        int result = counter+2;
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.someMethod(4);
    }
}