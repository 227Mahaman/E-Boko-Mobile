package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Etudiant {

    @Id
    private Long idE;
    private String matriculeE;
    private String nomE;
    private String prenomE;
    private Date dateNE;
    private String lieuNE;
    private String adressePersoE;
    private String adresseProE;
    private String emailE;
    private String sexE;
    private String nationaliteE;
    private String mobileE;
    private String nomSCE;
    private String telSCE;
    private String fonctionSCE;
    private String serviceSCE;
    private Date dateCreation;

    public Etudiant() {
    }

    public Etudiant(Long idE, String matriculeE, String nomE, String prenomE, Date dateNE, String lieuNE, String adressePersoE, String adresseProE, String emailE, String sexE, String nationaliteE, String mobileE, String nomSCE, String telSCE, String fonctionSCE, String serviceSCE, Date dateCreation) {
        this.idE = idE;
        this.matriculeE = matriculeE;
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.dateNE = dateNE;
        this.lieuNE = lieuNE;
        this.adressePersoE = adressePersoE;
        this.adresseProE = adresseProE;
        this.emailE = emailE;
        this.sexE = sexE;
        this.nationaliteE = nationaliteE;
        this.mobileE = mobileE;
        this.nomSCE = nomSCE;
        this.telSCE = telSCE;
        this.fonctionSCE = fonctionSCE;
        this.serviceSCE = serviceSCE;
        this.dateCreation = dateCreation;
    }

    public Long getIdE() {
        return idE;
    }

    public void setIdE(Long idE) {
        this.idE = idE;
    }

    public String getMatriculeE() {
        return matriculeE;
    }

    public void setMatriculeE(String matriculeE) {
        this.matriculeE = matriculeE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public Date getDateNE() {
        return dateNE;
    }

    public void setDateNE(Date dateNE) {
        this.dateNE = dateNE;
    }

    public String getLieuNE() {
        return lieuNE;
    }

    public void setLieuNE(String lieuNE) {
        this.lieuNE = lieuNE;
    }

    public String getAdressePersoE() {
        return adressePersoE;
    }

    public void setAdressePersoE(String adressePersoE) {
        this.adressePersoE = adressePersoE;
    }

    public String getAdresseProE() {
        return adresseProE;
    }

    public void setAdresseProE(String adresseProE) {
        this.adresseProE = adresseProE;
    }

    public String getEmailE() {
        return emailE;
    }

    public void setEmailE(String emailE) {
        this.emailE = emailE;
    }

    public String getSexE() {
        return sexE;
    }

    public void setSexE(String sexE) {
        this.sexE = sexE;
    }

    public String getNationaliteE() {
        return nationaliteE;
    }

    public void setNationaliteE(String nationaliteE) {
        this.nationaliteE = nationaliteE;
    }

    public String getMobileE() {
        return mobileE;
    }

    public void setMobileE(String mobileE) {
        this.mobileE = mobileE;
    }

    public String getNomSCE() {
        return nomSCE;
    }

    public void setNomSCE(String nomSCE) {
        this.nomSCE = nomSCE;
    }

    public String getTelSCE() {
        return telSCE;
    }

    public void setTelSCE(String telSCE) {
        this.telSCE = telSCE;
    }

    public String getFonctionSCE() {
        return fonctionSCE;
    }

    public void setFonctionSCE(String fonctionSCE) {
        this.fonctionSCE = fonctionSCE;
    }

    public String getServiceSCE() {
        return serviceSCE;
    }

    public void setServiceSCE(String serviceSCE) {
        this.serviceSCE = serviceSCE;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
