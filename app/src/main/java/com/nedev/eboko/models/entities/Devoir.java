package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Devoir {

    @Id
    private long id;
    private Long idD;
    private String codeD;
    private String codeNu;
    private Date dateD;
    private String sessionD;
    private String typeD;
    private String coefD;
    private Date dateRemiseD;
    private ToOne<Module> idMo;
    private String nbHeureD;
    private String heureDebutD;
    private String periodeD;

    public Devoir() {
    }

    public Devoir(Long idD, String codeD, String codeNu, Date dateD, String sessionD, String typeD, String coefD, Date dateRemiseD, ToOne<Module> idMo, String nbHeureD, String heureDebutD, String periodeD) {
        this.idD = idD;
        this.codeD = codeD;
        this.codeNu = codeNu;
        this.dateD = dateD;
        this.sessionD = sessionD;
        this.typeD = typeD;
        this.coefD = coefD;
        this.dateRemiseD = dateRemiseD;
        this.idMo = idMo;
        this.nbHeureD = nbHeureD;
        this.heureDebutD = heureDebutD;
        this.periodeD = periodeD;
    }

    public Long getIdD() {
        return idD;
    }

    public void setIdD(Long idD) {
        this.idD = idD;
    }

    public String getCodeD() {
        return codeD;
    }

    public void setCodeD(String codeD) {
        this.codeD = codeD;
    }

    public String getCodeNu() {
        return codeNu;
    }

    public void setCodeNu(String codeNu) {
        this.codeNu = codeNu;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public String getSessionD() {
        return sessionD;
    }

    public void setSessionD(String sessionD) {
        this.sessionD = sessionD;
    }

    public String getTypeD() {
        return typeD;
    }

    public void setTypeD(String typeD) {
        this.typeD = typeD;
    }

    public String getCoefD() {
        return coefD;
    }

    public void setCoefD(String coefD) {
        this.coefD = coefD;
    }

    public Date getDateRemiseD() {
        return dateRemiseD;
    }

    public void setDateRemiseD(Date dateRemiseD) {
        this.dateRemiseD = dateRemiseD;
    }

    public ToOne<Module> getIdMo() {
        return idMo;
    }

    public void setIdMo(ToOne<Module> idMo) {
        this.idMo = idMo;
    }

    public String getNbHeureD() {
        return nbHeureD;
    }

    public void setNbHeureD(String nbHeureD) {
        this.nbHeureD = nbHeureD;
    }

    public String getHeureDebutD() {
        return heureDebutD;
    }

    public void setHeureDebutD(String heureDebutD) {
        this.heureDebutD = heureDebutD;
    }

    public String getPeriodeD() {
        return periodeD;
    }

    public void setPeriodeD(String periodeD) {
        this.periodeD = periodeD;
    }
}
