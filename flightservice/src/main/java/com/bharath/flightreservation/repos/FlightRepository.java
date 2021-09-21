package com.bharath.flightreservation.repos;

import com.bharath.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
