package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Semestre {

    @Id
    public long id;
    private long idS;
    private String codeS;
    private ToOne<Niveau> idN;
    private String intituleS;
    private Date dateCreation;

    public Semestre() {
    }

    public Semestre(long id, long idS, String codeS, ToOne<Niveau> idN, String intituleS, Date dateCreation) {
        this.id = id;
        this.idS = idS;
        this.codeS = codeS;
        this.idN = idN;
        this.intituleS = intituleS;
        this.dateCreation = dateCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdS() {
        return idS;
    }

    public void setIdS(long idS) {
        this.idS = idS;
    }

    public String getCodeS() {
        return codeS;
    }

    public void setCodeS(String codeS) {
        this.codeS = codeS;
    }

    public ToOne<Niveau> getIdN() {
        return idN;
    }

    public void setIdN(ToOne<Niveau> idN) {
        this.idN = idN;
    }

    public String getIntituleS() {
        return intituleS;
    }

    public void setIntituleS(String intituleS) {
        this.intituleS = intituleS;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
