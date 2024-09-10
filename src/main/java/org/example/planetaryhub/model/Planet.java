package org.example.planetaryhub.model;

public class Planet {
    private String name;
    private double radius;
    private double distanceFromSun;
    private String atmosphere;

    public Planet(String name, double radius, double distanceFromSun, String atmosphere) {
        this.name = name;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
        this.atmosphere = atmosphere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }
}
