package com.labmaster.labmaster_03.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity

public class Test_Results {
    private  Test_ResultsId pk;

    @EmbeddedId
    public Test_ResultsId getPk() {
        return pk;
    }

    public void setPk(Test_ResultsId pk) {
        this.pk = pk;
    }
}
