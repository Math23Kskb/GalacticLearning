package org.example.planetaryhub.repository;

public class EarthStrategy implements PlanetStrategy {

    @Override
    public void showPlanetInfo() {
        System.out.println("Planet: Earth");
        System.out.println("Radius: 6,371 km");
        System.out.println("Distance from Sun: 149.6 million km");
        System.out.println("Atmosphere: Nitrogen, Oxygen");
        System.out.println("Has life: Yes");
    }
}
