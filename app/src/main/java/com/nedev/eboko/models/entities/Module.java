package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Module {

    @Id
    private Long idMo;
    private String codeMo;
    private String creditMo;
    private Anneescolaire idA;
    private ToOne<Filiere> idF;
    private ToOne<Niveau> idN;
    private ToOne<Ue> idUe;
    private String idM;
    private ToOne<Semestre> idS;
    private String choixMo;
    private Date dateCreation;

    public Module() {
    }

    public Module(Long idMo, String codeMo, String creditMo, Anneescolaire idA, ToOne<Filiere> idF, ToOne<Niveau> idN, ToOne<Ue> idUe, String idM, ToOne<Semestre> idS, String choixMo, Date dateCreation) {
        this.idMo = idMo;
        this.codeMo = codeMo;
        this.creditMo = creditMo;
        this.idA = idA;
        this.idF = idF;
        this.idN = idN;
        this.idUe = idUe;
        this.idM = idM;
        this.idS = idS;
        this.choixMo = choixMo;
        this.dateCreation = dateCreation;
    }

    public Long getIdMo() {
        return idMo;
    }

    public void setIdMo(Long idMo) {
        this.idMo = idMo;
    }

    public String getCodeMo() {
        return codeMo;
    }

    public void setCodeMo(String codeMo) {
        this.codeMo = codeMo;
    }

    public String getCreditMo() {
        return creditMo;
    }

    public void setCreditMo(String creditMo) {
        this.creditMo = creditMo;
    }

    public Anneescolaire getIdA() {
        return idA;
    }

    public void setIdA(Anneescolaire idA) {
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

    public ToOne<Ue> getIdUe() {
        return idUe;
    }

    public void setIdUe(ToOne<Ue> idUe) {
        this.idUe = idUe;
    }

    public String getIdM() {
        return idM;
    }

    public void setIdM(String idM) {
        this.idM = idM;
    }

    public ToOne<Semestre> getIdS() {
        return idS;
    }

    public void setIdS(ToOne<Semestre> idS) {
        this.idS = idS;
    }

    public String getChoixMo() {
        return choixMo;
    }

    public void setChoixMo(String choixMo) {
        this.choixMo = choixMo;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
