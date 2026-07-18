package com.event.eventmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.event.eventmanagement.entity.Booking;
import com.event.eventmanagement.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/add")
    public Booking addBooking(
            @RequestBody Booking booking) {

        return bookingService.saveBooking(booking);
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getUserBookings(
            @PathVariable Long userId) {

        return bookingService.getUserBookings(userId);
    }
    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}