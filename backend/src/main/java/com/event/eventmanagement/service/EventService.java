package com.event.eventmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.eventmanagement.entity.Event;
import com.event.eventmanagement.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Add event (Admin)
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    // View all events (User)
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

	public Event getEventById(Long id) {
		// TODO Auto-generated method stub
		return eventRepository.findById(id).orElse(null);
	}
}
