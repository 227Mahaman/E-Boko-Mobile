package com.nedev.eboko.models.entities;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Anneescolaire {

    @Id
    private Long idA;
    private String codeA;
    private String intituleA;
    private String datasourceA;
    private String dA;

    public Anneescolaire() {
    }

    public Anneescolaire(Long idA, String codeA, String intituleA, String datasourceA, String dA) {
        this.idA = idA;
        this.codeA = codeA;
        this.intituleA = intituleA;
        this.datasourceA = datasourceA;
        this.dA = dA;
    }

    public Long getIdA() {
        return idA;
    }

    public void setIdA(Long idA) {
        this.idA = idA;
    }

    public String getCodeA() {
        return codeA;
    }

    public void setCodeA(String codeA) {
        this.codeA = codeA;
    }

    public String getIntituleA() {
        return intituleA;
    }

    public void setIntituleA(String intituleA) {
        this.intituleA = intituleA;
    }

    public String getDatasourceA() {
        return datasourceA;
    }

    public void setDatasourceA(String datasourceA) {
        this.datasourceA = datasourceA;
    }

    public String getdA() {
        return dA;
    }

    public void setdA(String dA) {
        this.dA = dA;
    }
}
