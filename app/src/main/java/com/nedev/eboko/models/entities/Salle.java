package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Salle {

    @Id
    private long id;
    private long idSa;
    private String codeSa;
    private String intituleSa;
    private String descriptionSa;
    private String capaciteSa;
    private Date dateCreation;

    public Salle() {
    }

    public Salle(long id, long idSa, String codeSa, String intituleSa, String descriptionSa, String capaciteSa, Date dateCreation) {
        this.id = id;
        this.idSa = idSa;
        this.codeSa = codeSa;
        this.intituleSa = intituleSa;
        this.descriptionSa = descriptionSa;
        this.capaciteSa = capaciteSa;
        this.dateCreation = dateCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSa() {
        return idSa;
    }

    public void setIdSa(long idSa) {
        this.idSa = idSa;
    }

    public String getCodeSa() {
        return codeSa;
    }

    public void setCodeSa(String codeSa) {
        this.codeSa = codeSa;
    }

    public String getIntituleSa() {
        return intituleSa;
    }

    public void setIntituleSa(String intituleSa) {
        this.intituleSa = intituleSa;
    }

    public String getDescriptionSa() {
        return descriptionSa;
    }

    public void setDescriptionSa(String descriptionSa) {
        this.descriptionSa = descriptionSa;
    }

    public String getCapaciteSa() {
        return capaciteSa;
    }

    public void setCapaciteSa(String capaciteSa) {
        this.capaciteSa = capaciteSa;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
