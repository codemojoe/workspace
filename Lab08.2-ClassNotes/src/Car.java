public class Car extends Vehicle {

    private String make;
    private String model;

    public Car(String vin) {
        super(vin); //delegate to superclass constructor for vin
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + getVin() +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

class CarClient {
    public static void main(String[] args) {
        Car c = new Car("ABC123");
        String vin = c.getVin();
        System.out.println(vin);
        System.out.println(c);

        Vehicle v = new Car("XYZ123");
        System.out.println(v);

        DMV dmv = new DMV();
        dmv.register(c);
    }
}
