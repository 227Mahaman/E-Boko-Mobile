package com.nedev.eboko.models.entities;

import java.util.Date;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Session {

    @Id
    public long id;
    private long idSes;
    private String codeSes;
    private Date debutSes;
    private Date finSes;
    private ToOne<Ue> idUe;

    public Session() {
    }

    public Session(long id, long idSes, String codeSes, Date debutSes, Date finSes, ToOne<Ue> idUe) {
        this.id = id;
        this.idSes = idSes;
        this.codeSes = codeSes;
        this.debutSes = debutSes;
        this.finSes = finSes;
        this.idUe = idUe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdSes() {
        return idSes;
    }

    public void setIdSes(long idSes) {
        this.idSes = idSes;
    }

    public String getCodeSes() {
        return codeSes;
    }

    public void setCodeSes(String codeSes) {
        this.codeSes = codeSes;
    }

    public Date getDebutSes() {
        return debutSes;
    }

    public void setDebutSes(Date debutSes) {
        this.debutSes = debutSes;
    }

    public Date getFinSes() {
        return finSes;
    }

    public void setFinSes(Date finSes) {
        this.finSes = finSes;
    }

    public ToOne<Ue> getIdUe() {
        return idUe;
    }

    public void setIdUe(ToOne<Ue> idUe) {
        this.idUe = idUe;
    }
}
