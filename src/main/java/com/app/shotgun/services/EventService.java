package com.app.shotgun.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.data.Event;
import com.app.shotgun.repositories.EventRepository;

@Service
public class EventService {
    

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }

    public Optional<Event> getEventById(Integer id) {
        return eventRepository.findById(id);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Integer id, Event event) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(!optionalEvent.isPresent()){
            return null;
        }

        Event existingEvent = optionalEvent.get();
        existingEvent.setNom(event.getNom());
        existingEvent.setDescription(event.getDescription());
        existingEvent.setLocalisation(event.getLocalisation());
        existingEvent.setDate(event.getDate());
        existingEvent.setCreatorUserId(event.getCreatorUserId());
        existingEvent.setEventTypeId(event.getEventTypeId());
        return eventRepository.save(existingEvent);
    }

    public void deleteEvent(Integer id) {
        eventRepository.deleteById(id);
    }
}
