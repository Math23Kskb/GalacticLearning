package org.example;

import org.example.planetaryhub.repository.EarthStrategy;
import org.example.planetaryhub.repository.MarsStrategy;
import org.example.planetaryhub.repository.PlanetContext;

public class Main {
    public static void main(String[] args) {
        PlanetContext planetContext = new PlanetContext();

        planetContext.setPlanetStrategy((new EarthStrategy()));
        planetContext.executeStrategy();

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        planetContext.setPlanetStrategy((new MarsStrategy()));
        planetContext.executeStrategy();
    }
}