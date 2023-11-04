package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.ReservationType;
import com.app.shotgun.repositories.ReservationTypeRepository;

@Service
public class ReservationTypeService {

    @Autowired
    private ReservationTypeRepository reservationTypeRepository;

    public List<ReservationType> getAllReservationTypes() {
        return (List<ReservationType>) reservationTypeRepository.findAll();
    }

    public Optional<ReservationType> getReservationTypeById(Integer id) {
        return reservationTypeRepository.findById(id);
    }

}
