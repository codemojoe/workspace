class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    private String brand;
    private int volume;
    private boolean isMuted;
    private int oldVolume;


    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public void toggleMute() {
        if (isMuted()) {
            performUnmuteOperation();
        } else {
            performMuteOperation();
        }
    }

    private void performUnmuteOperation() {
        volume = oldVolume;
        isMuted = false;
    }

    private void performMuteOperation() {
        oldVolume = volume;
        volume = MIN_VOLUME;
        isMuted = true;
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

    public static int getInstanceCount() {
        return instanceCount;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid input. Please input a valid brand name.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.isMuted = false;
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("Invalid input. Input volume within range.");
        }
    }

    @Override
    public String toString() {
        String volumeString = isMuted ? "muted" : String.valueOf(getVolume());
        return "Television: " +
                "brand='" + brand + '\'' +
                ", volume=" + volumeString;
    }
}