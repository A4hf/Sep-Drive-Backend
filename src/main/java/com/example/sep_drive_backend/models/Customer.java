package com.example.sep_drive_backend.models;

import com.example.sep_drive_backend.constants.RoleEnum;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends users {
    private float rating;
    private int totalRides;


    public Customer() {}

    public Customer(String username, String firstName, String lastName, String email, float rating, int totalRides) {
        super(username, firstName, lastName, email);
        this.rating = rating;
        this.totalRides = totalRides;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }
}
