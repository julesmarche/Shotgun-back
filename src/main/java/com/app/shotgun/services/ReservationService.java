package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.Reservation;
import com.app.shotgun.repositories.ReservationRepository;

@Service
public class ReservationService {
    

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(Integer id) {
        return reservationRepository.findById(id);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Integer id, Reservation reservation) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(id);
        if(!optionalReservation.isPresent()){
            return null;
        }

        Reservation existingReservation = optionalReservation.get();
        existingReservation.setImg(reservation.getImg());
        existingReservation.setNom(reservation.getNom());
        existingReservation.setReservationTypeId(reservation.getReservationTypeId());
        return reservationRepository.save(existingReservation);
    }

    public void deleteReservation(Integer id) {
        reservationRepository.deleteById(id);
    }
}
