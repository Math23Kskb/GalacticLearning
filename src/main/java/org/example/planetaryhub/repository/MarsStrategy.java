package org.example.planetaryhub.repository;

public class MarsStrategy implements PlanetStrategy {
    @Override
    public void showPlanetInfo() {
        System.out.println("Planet: Mars");
        System.out.println("Radius: 3,389.5 km");
        System.out.println("Distance from Sun: 227.9 million km");
        System.out.println("Atmosphere: Carbon Dioxide, Nitrogen");
        System.out.println("Has life: No (As far as we know)");
    }
}
