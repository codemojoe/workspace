class Television {
    private String brand;
    private int volume;

    public Television() {}

    public Television(String brand) {
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation (obviously)
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("You turned on your " + brand + " at volume " + volume + ". " + "It is connected at " + isConnected);
    }

    public void turnOff() {
        System.out.println("You turned off your " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}