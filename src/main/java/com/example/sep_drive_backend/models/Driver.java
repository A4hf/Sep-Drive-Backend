package com.example.sep_drive_backend.models;

import com.example.sep_drive_backend.constants.RoleEnum;
import com.example.sep_drive_backend.constants.VehicleClassEnum;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Driver")
public class Driver extends users {
    private float rating;
    private int totalRides;
    private VehicleClassEnum vehicleClass;

    public Driver() {}

    public Driver(String username, String firstName, String lastName, String email, float rating, VehicleClassEnum vehicleClass, int totalRides) {
        super(username, firstName, lastName, email);
        this.rating = rating;
        this.vehicleClass = vehicleClass;
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

    public VehicleClassEnum getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(VehicleClassEnum vehicleClass) {
        this.vehicleClass = vehicleClass;
    }
}
