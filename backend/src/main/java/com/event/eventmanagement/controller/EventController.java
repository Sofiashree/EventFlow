package com.event.eventmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.event.eventmanagement.entity.Event;
import com.event.eventmanagement.service.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin
public class EventController {

    @Autowired
    private EventService eventService;

    // Admin: Add Event
    @PostMapping("/add")
    public Event addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    // User: View Events
    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.getEventById(id);
    }
    
}
