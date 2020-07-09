package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Niveau {

    @Id
    public long id;
    private long idN;
    private String codeN;
    private String intituleN;
    private String montantScolariteN;
    private Date dateCreation;

    public Niveau() {
    }

    public Niveau(long id, long idN, String codeN, String intituleN, String montantScolariteN, Date dateCreation) {
        this.id = id;
        this.idN = idN;
        this.codeN = codeN;
        this.intituleN = intituleN;
        this.montantScolariteN = montantScolariteN;
        this.dateCreation = dateCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdN() {
        return idN;
    }

    public void setIdN(long idN) {
        this.idN = idN;
    }

    public String getCodeN() {
        return codeN;
    }

    public void setCodeN(String codeN) {
        this.codeN = codeN;
    }

    public String getIntituleN() {
        return intituleN;
    }

    public void setIntituleN(String intituleN) {
        this.intituleN = intituleN;
    }

    public String getMontantScolariteN() {
        return montantScolariteN;
    }

    public void setMontantScolariteN(String montantScolariteN) {
        this.montantScolariteN = montantScolariteN;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
