package com.app.shotgun.controller;

import com.app.data.EtatType;
import com.app.data.EventType;
import com.app.data.ReservationType;
import com.app.shotgun.services.EtatTypeService;
import com.app.shotgun.services.EventTypeService;
import com.app.shotgun.services.ReservationTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservationTypes")
public class ReservationTypeController {

    @Autowired
    private ReservationTypeService reservationTypeService;

    @GetMapping
    public ResponseEntity<List<ReservationType>> getAllEventTypes() {
        List<ReservationType> reservationTypes = reservationTypeService.getAllReservationTypes();
        return new ResponseEntity<>(reservationTypes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationType> getEventTypeById(@PathVariable Integer id) {
        Optional<ReservationType> reservationType = reservationTypeService.getReservationTypeById(id);
        HttpStatus response = HttpStatus.OK;
        if (!reservationType.isPresent()) {
            response = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(reservationType.orElse(null), response);
    }
}
