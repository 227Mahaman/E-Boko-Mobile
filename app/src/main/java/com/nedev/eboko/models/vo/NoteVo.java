package com.nedev.eboko.models.vo;

import com.mobandme.android.transformer.compiler.Mappable;
import com.mobandme.android.transformer.compiler.Mapped;
import com.nedev.eboko.models.entities.Devoir;
import com.nedev.eboko.models.entities.Etudiant;
import com.nedev.eboko.models.entities.Note;

import java.util.Date;

import io.objectbox.relation.ToOne;

@Mappable( with = Note.class)
public class NoteVo {
    @Mapped
    private Long idNo;
    @Mapped
    private String codeNo;
    @Mapped
    private String valeurNo;
    private Devoir idD;
    private Etudiant idE;
    private Date dateCreation;

    public NoteVo() {
    }

    public Long getIdNo() {
        return idNo;
    }

    public void setIdNo(Long idNo) {
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

    public Devoir getIdD() {
        return idD;
    }

    public void setIdD(Devoir idD) {
        this.idD = idD;
    }

    public Etudiant getIdE() {
        return idE;
    }

    public void setIdE(Etudiant idE) {
        this.idE = idE;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "NoteVo{" +
                "idNo=" + idNo +
                ", codeNo='" + codeNo + '\'' +
                ", valeurNo='" + valeurNo + '\'' +
                ", idD=" + idD +
                ", idE=" + idE +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
