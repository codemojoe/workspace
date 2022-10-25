package composition_example;

public class Address {
    private String city;
    private String country;

    public Address() {

    }

    public Address(String city, String country) {
        setCity(city);
        setCountry(country);
    }

    public String getAddressInfo(){
        String addressInfo = "City: " + getCity() + " Country: " + getCountry();
        return addressInfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
