package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Filiere {

    @Id
    private Long idF;
    private String codeF;
    private String intituleF;
    private String descriptionF;
    private Date dateCreation;

    public Filiere() {
    }

    public Filiere(Long idF, String codeF, String intituleF, String descriptionF, Date dateCreation) {
        this.idF = idF;
        this.codeF = codeF;
        this.intituleF = intituleF;
        this.descriptionF = descriptionF;
        this.dateCreation = dateCreation;
    }

    public Long getIdF() {
        return idF;
    }

    public void setIdF(Long idF) {
        this.idF = idF;
    }

    public String getCodeF() {
        return codeF;
    }

    public void setCodeF(String codeF) {
        this.codeF = codeF;
    }

    public String getIntituleF() {
        return intituleF;
    }

    public void setIntituleF(String intituleF) {
        this.intituleF = intituleF;
    }

    public String getDescriptionF() {
        return descriptionF;
    }

    public void setDescriptionF(String descriptionF) {
        this.descriptionF = descriptionF;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
