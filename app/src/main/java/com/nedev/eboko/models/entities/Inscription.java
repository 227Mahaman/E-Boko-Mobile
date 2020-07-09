package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Inscription {

    @Id
    public long id;
    private long idI;
    private String codeI;
    private Date dateI;
    private ToOne<Anneescolaire> idA;
    private ToOne<Filiere> idF;
    private ToOne<Niveau> idN;
    private String idNu;
    private String matriculeE;
    private Date dateCreation;

    public Inscription() {
    }

    public Inscription(long id, long idI, String codeI, Date dateI, ToOne<Anneescolaire> idA, ToOne<Filiere> idF, ToOne<Niveau> idN, String idNu, String matriculeE, Date dateCreation) {
        this.id = id;
        this.idI = idI;
        this.codeI = codeI;
        this.dateI = dateI;
        this.idA = idA;
        this.idF = idF;
        this.idN = idN;
        this.idNu = idNu;
        this.matriculeE = matriculeE;
        this.dateCreation = dateCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdI() {
        return idI;
    }

    public void setIdI(Long idI) {
        this.idI = idI;
    }

    public String getCodeI() {
        return codeI;
    }

    public void setCodeI(String codeI) {
        this.codeI = codeI;
    }

    public Date getDateI() {
        return dateI;
    }

    public void setDateI(Date dateI) {
        this.dateI = dateI;
    }

    public ToOne<Anneescolaire> getIdA() {
        return idA;
    }

    public void setIdA(ToOne<Anneescolaire> idA) {
        this.idA = idA;
    }

    public ToOne<Filiere> getIdF() {
        return idF;
    }

    public void setIdF(ToOne<Filiere> idF) {
        this.idF = idF;
    }

    public ToOne<Niveau> getIdN() {
        return idN;
    }

    public void setIdN(ToOne<Niveau> idN) {
        this.idN = idN;
    }

    public String getIdNu() {
        return idNu;
    }

    public void setIdNu(String idNu) {
        this.idNu = idNu;
    }

    public String getMatriculeE() {
        return matriculeE;
    }

    public void setMatriculeE(String matriculeE) {
        this.matriculeE = matriculeE;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
