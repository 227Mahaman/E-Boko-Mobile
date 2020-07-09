package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Note {

    @Id
    private long id;
    private long idNo;
    private String codeNo;
    private String valeurNo;
    private ToOne<Devoir> idD;
    private ToOne<Etudiant> idE;
    private Date dateCreation;

    public Note() {
    }

    public Note(long id, long idNo, String codeNo, String valeurNo, ToOne<Devoir> idD, ToOne<Etudiant> idE, Date dateCreation) {
        this.id = id;
        this.idNo = idNo;
        this.codeNo = codeNo;
        this.valeurNo = valeurNo;
        this.idD = idD;
        this.idE = idE;
        this.dateCreation = dateCreation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdNo() {
        return idNo;
    }

    public void setIdNo(long idNo) {
        this.idNo = idNo;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }

    public String getValeurNo() {
        return valeurNo;
    }

    public void setValeurNo(String valeurNo) {
        this.valeurNo = valeurNo;
    }

    public ToOne<Devoir> getIdD() {
        return idD;
    }

    public void setIdD(ToOne<Devoir> idD) {
        this.idD = idD;
    }

    public ToOne<Etudiant> getIdE() {
        return idE;
    }

    public void setIdE(ToOne<Etudiant> idE) {
        this.idE = idE;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
