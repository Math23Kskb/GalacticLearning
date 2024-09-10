package org.example;

import org.example.glossary.model.BasicGlossaryTerm;
import org.example.glossary.model.GlossaryTerm;
import org.example.glossary.service.GlossaryService;
import org.example.planetaryhub.repository.EarthStrategy;
import org.example.planetaryhub.repository.MarsStrategy;
import org.example.planetaryhub.repository.PlanetContext;

import java.util.Optional;

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

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        GlossaryService glossaryservice = new GlossaryService();

        glossaryservice.addTerm(new BasicGlossaryTerm("Black Hole", "A region of space where the gravitational pull is so strong that nothing, even light, can escape."));

        Optional<GlossaryTerm> searchedTerm = glossaryservice.findTerm("Star");

        if (searchedTerm.isPresent()) {
            System.out.println("Found term: " + searchedTerm.get());
        } else {
            System.out.println("Term not found in the glossary.");
        }

        System.out.println("\n All Glossary Terms:");
        for(GlossaryTerm term : glossaryservice.getAllTerms()) {
            System.out.println(term);
        }
    }
}