package com.app.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Reservation")
public class Reservation {
    @Id
    private int id;
    private String nom;
    private String img;

    @Column("reservation_type_id")
    private Integer reservationTypeId;




    public Integer getReservationTypeId() {
        return reservationTypeId;
    }

    public void setReservationTypeId(Integer reservationTypeId) {
        this.reservationTypeId = reservationTypeId;
    }

    public String getNom() {
        return nom;
    }

    public String getImg() {
        return img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
