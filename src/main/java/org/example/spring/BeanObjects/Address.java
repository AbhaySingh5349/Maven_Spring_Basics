package org.example.spring.BeanObjects;

public class Address {
    String pincode;
    String city;

    public Address(String pincode, String city) {
        this.pincode = pincode;
        this.city = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
