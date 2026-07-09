package com.skybooking.repository;

import com.skybooking.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    // Spring Data JPA сам сгенерирует SQL-запрос по названию метода:
    // WHERE LOWER(departure_from) = LOWER(?) AND LOWER(arrival_to) = LOWER(?)
    List<Flight> findByDepartureFromIgnoreCaseAndArrivalToIgnoreCase(String departureFrom, String arrivalTo);
}
