package com.place.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "places")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String placeName;
    private String overview;
    private double distanceFromCity;

    private String bestTimeToVisit;

    // Constructors
    public Location() {
    }

    public Location(String placeName, String overview, double distanceFromCity, String bestTimeToVisit) {
        this.placeName = placeName;
        this.overview = overview;
        this.distanceFromCity = distanceFromCity;

        this.bestTimeToVisit = bestTimeToVisit;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getDistanceFromCity() {
        return distanceFromCity;
    }

    public void setDistanceFromCity(double distanceFromCity) {
        this.distanceFromCity = distanceFromCity;
    }



    public String getBestTimeToVisit() {
        return bestTimeToVisit;
    }

    public void setBestTimeToVisit(String bestTimeToVisit) {
        this.bestTimeToVisit = bestTimeToVisit;
    }
}
