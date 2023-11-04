package com.app.data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Annonce")
public class Annonce {
    @Id
    public int id;
    public String nom;
    public String description;
    public Double prix;
    public Timestamp date;
    public String localisation;
    @Column("etat_type_id")
    private Integer etatTypeId;
    @Column("creator_user_id")
    private Integer creatorUserId;
    @Column("shotguner_user_id")
    private Integer shotgunerUserId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Integer getEtatTypeId() {
        return etatTypeId;
    }

    public void setEtatTypeId(Integer etatTypeId) {
        this.etatTypeId = etatTypeId;
    }

    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Integer getShotgunerUserId() {
        return shotgunerUserId;
    }

    public void setShotgunerUserId(Integer shotgunerUserId) {
        this.shotgunerUserId = shotgunerUserId;
    }
}
