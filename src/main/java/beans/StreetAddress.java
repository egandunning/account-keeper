package beans;

import java.io.Serializable;

public class StreetAddress implements Serializable {

    public static final long serialVersionUID = 1L;

    private final long id;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String state;
    private String zip;

    public StreetAddress() {
        id = 0;
    }

    public StreetAddress(long id, String addressLineOne, String addressLineTwo,
            String city, String state, String zip) {
        this.id = id;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public StreetAddress(long id, String addressLineOne, String city, String state,
            String zip) {
        this(id, addressLineOne, "", city, state, zip);
    }

    public long getId() {
        return id;
    }
    
    public String getAddressLineOne() {
        return this.addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return this.addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "StreetAddress [addressLineOne=" + addressLineOne
                + ", addressLineTwo=" + addressLineTwo + ", city=" + city
                + ", state=" + state + ", zip=" + zip + "]";
    }
}