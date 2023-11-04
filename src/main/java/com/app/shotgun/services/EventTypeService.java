package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.EventType;
import com.app.shotgun.repositories.EventTypeRepository;

@Service
public class EventTypeService {

    @Autowired
    private EventTypeRepository eventTypeRepository;

    public List<EventType> getAllEventTypes() {
        return (List<EventType>) eventTypeRepository.findAll();
    }

    public Optional<EventType> getEventTypeById(Integer id) {
        return eventTypeRepository.findById(id);
    }

}
