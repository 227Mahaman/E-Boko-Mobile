package com.nedev.eboko.models.entities;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Anneescolaire {

    @Id
    public long id;
    private long idA;
    private String codeA;
    private String intituleA;
    private String datasourceA;
    private String dtA;

    public Anneescolaire() {
    }

    public Anneescolaire(long id, long idA, String codeA, String intituleA, String datasourceA, String dtA) {
        this.id = id;
        this.idA = idA;
        this.codeA = codeA;
        this.intituleA = intituleA;
        this.datasourceA = datasourceA;
        this.dtA = dtA;
    }

    public long getId() {
        return id;
    }

    public long getIdA() {
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

    public String getDtA() {
        return dtA;
    }

    public void setDtA(String dtA) {
        this.dtA = dtA;
    }
}
