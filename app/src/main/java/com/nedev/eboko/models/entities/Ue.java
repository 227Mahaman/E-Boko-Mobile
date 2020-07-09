package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Ue {

    @Id
    private Long idUe;
    private String codeUe;
    private String intitule;
    private Date dateCreation;

    public Ue() {
    }

    public Ue(Long idUe, String codeUe, String intitule, Date dateCreation) {
        this.idUe = idUe;
        this.codeUe = codeUe;
        this.intitule = intitule;
        this.dateCreation = dateCreation;
    }

    public Long getIdUe() {
        return idUe;
    }

    public void setIdUe(Long idUe) {
        this.idUe = idUe;
    }

    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
