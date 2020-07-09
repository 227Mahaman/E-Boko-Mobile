package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Salle {

    @Id
    private Long idSa;
    private String codeSa;
    private String intituleSa;
    private String descriptionSa;
    private String capaciteSa;
    private Date dateCreation;

    public Salle() {
    }

    public Salle(Long idSa, String codeSa, String intituleSa, String descriptionSa, String capaciteSa, Date dateCreation) {
        this.idSa = idSa;
        this.codeSa = codeSa;
        this.intituleSa = intituleSa;
        this.descriptionSa = descriptionSa;
        this.capaciteSa = capaciteSa;
        this.dateCreation = dateCreation;
    }

    public Long getIdSa() {
        return idSa;
    }

    public void setIdSa(Long idSa) {
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
