package org.example.glossary.service;

import org.example.glossary.model.BasicGlossaryTerm;
import org.example.glossary.model.GlossaryTerm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GlossaryService {
    private List<GlossaryTerm> glossaryTermsList;

    public GlossaryService() {
        this.glossaryTermsList = new ArrayList<>();
        initializeGlossary();
    }

    private void initializeGlossary() {
        glossaryTermsList.add(new BasicGlossaryTerm("Planet", "A celestial body orbiting a star."));
        glossaryTermsList.add(new BasicGlossaryTerm("Star", "A luminous sphere of plasma held together by gravity"));
        glossaryTermsList.add(new BasicGlossaryTerm("Galaxy", "A system of millions or billions of stars, together with gas and dust, held together by gravitacional attraction."));
    }

    public void addTerm(GlossaryTerm term) {
        glossaryTermsList.add(term);
    }

    public Optional<GlossaryTerm> findTerm(String term) {
        return glossaryTermsList.stream()
                .filter(t -> t.getTerm().equalsIgnoreCase(term))
                .findFirst();
    }

    public List<GlossaryTerm> getAllTerms() {
        return glossaryTermsList;
    }

}
