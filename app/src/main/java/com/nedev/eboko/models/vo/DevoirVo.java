package com.nedev.eboko.models.vo;

import com.mobandme.android.transformer.compiler.Mappable;
import com.mobandme.android.transformer.compiler.Mapped;
import com.nedev.eboko.models.entities.Devoir;
import com.nedev.eboko.models.entities.Module;

import java.util.Date;

import io.objectbox.relation.ToOne;

@Mappable( with = Devoir.class)
public class DevoirVo {

    @Mapped
    private Long idD;
    @Mapped
    private String codeD;
    @Mapped
    private String codeNu;
    @Mapped
    private Date dateD;
    @Mapped
    private String sessionD;
    @Mapped
    private String typeD;
    @Mapped
    private String coefD;
    @Mapped
    private Date dateRemiseD;
    private Module idMo;
    @Mapped
    private String nbHeureD;
    @Mapped
    private String heureDebutD;
    @Mapped
    private String periodeD;

    public DevoirVo() {
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

    public Module getIdMo() {
        return idMo;
    }

    public void setIdMo(Module idMo) {
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

    @Override
    public String toString() {
        return "DevoirVo{" +
                "idD=" + idD +
                ", codeD='" + codeD + '\'' +
                ", codeNu='" + codeNu + '\'' +
                ", dateD=" + dateD +
                ", sessionD='" + sessionD + '\'' +
                ", typeD='" + typeD + '\'' +
                ", coefD='" + coefD + '\'' +
                ", dateRemiseD=" + dateRemiseD +
                ", idMo=" + idMo +
                ", nbHeureD='" + nbHeureD + '\'' +
                ", heureDebutD='" + heureDebutD + '\'' +
                ", periodeD='" + periodeD + '\'' +
                '}';
    }
}
