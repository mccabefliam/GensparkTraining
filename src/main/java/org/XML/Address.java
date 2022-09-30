package org.XML;

public class Address {

    public String city;
    public String state;
    public String country;
    public String zipcode;


    public Address() {
    }
    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String material) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address {" +
                "City=" + city  +
                ", State=" + state +
                ", Country=" + country +
                ", Zipcode=" + zipcode +
                '}';
    }
}
