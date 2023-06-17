package com.example.XtramilePatient.patients;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String address;
    private String suburb;
    private String state;
    private String postcode;

    // Constructors, getters, and setters

    // Default constructor
    public Address() {
    }

    // Parameterized constructor
    public Address(String address, String suburb, String state, String postcode) {
        this.address = address;
        this.suburb = suburb;
        this.state = state;
        this.postcode = postcode;
    }

    // Getters and setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
