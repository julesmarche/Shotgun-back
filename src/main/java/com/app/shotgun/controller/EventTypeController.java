package com.app.shotgun.controller;

import com.app.data.EtatType;
import com.app.data.EventType;
import com.app.shotgun.services.EtatTypeService;
import com.app.shotgun.services.EventTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/eventTypes")
public class EventTypeController {

    @Autowired
    private EventTypeService eventTypeService;

    @GetMapping
    public ResponseEntity<List<EventType>> getAllEventTypes() {
        List<EventType> etatTypes = eventTypeService.getAllEventTypes();
        return new ResponseEntity<>(etatTypes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventType> getEventTypeById(@PathVariable Integer id) {
        Optional<EventType> eventType = eventTypeService.getEventTypeById(id);
        HttpStatus response = HttpStatus.OK;
        if (!eventType.isPresent()) {
            response = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(eventType.orElse(null), response);
    }
}
