package org.example.planetaryhub.repository;

public class PlanetContext {
    private PlanetStrategy planetStrategy;

    public void setPlanetStrategy(PlanetStrategy planetStrategy) {
        this.planetStrategy = planetStrategy;
    }

    public void executeStrategy() {
        if(planetStrategy != null) {
            planetStrategy.showPlanetInfo();
        } else {
            System.out.println("No planet strategy has been set.");
        }
    }
}
