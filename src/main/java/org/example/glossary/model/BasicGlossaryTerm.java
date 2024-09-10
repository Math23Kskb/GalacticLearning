package org.example.glossary.model;

public class BasicGlossaryTerm implements GlossaryTerm {
    private String term;
    private String definition;

    public BasicGlossaryTerm(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }

    @Override
    public String getTerm() {
        return "";
    }

    @Override
    public void setTerm(String term) {

    }

    @Override
    public String getDefinition() {
        return "";
    }

    @Override
    public void setDefinition(String definition) {

    }

    @Override
    public String toString() {
        return "GlossaryTerm{" +
                "term = " + term + '\'' +
                ", definition = " + definition + '\'' +
                '}';
    }
}
