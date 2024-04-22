package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Test_ResultsId {
    private Test test;
    private Results results;

    @ManyToOne
    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @ManyToOne
    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
