package com.bharath.flightreservation.controller;

import com.bharath.flightreservation.entities.Flight;
import com.bharath.flightreservation.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationRestController {

    @Autowired
    private FlightRepository flightRepository;

    @RequestMapping(value="/flights", method= RequestMethod.GET)
    public List<Flight> findFlights(){
        return flightRepository.findAll();
    }
 }
