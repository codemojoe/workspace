class Car {
    private String make;
    private String model;
    private int mpg;
    private Engine engine;
    private Transmission transmission;

    public Car(){};
    public Car(String model, Engine engine, Transmission transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }
    public void start() {
        System.out.println("You started your " + make + " " + model + " and it can run at " + mpg + " mpg");
    }

    public void shutOff() {
        System.out.println("You shut off your " + make + " " + model);
    }

    public void someMethodInCarClass() {
        engine.rev();
        Engine.myEnginerStaticMethod();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mgp) {
        this.mpg = mgp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mgp=" + mpg +
                '}';
    }

}