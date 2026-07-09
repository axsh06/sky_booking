package com.skybooking.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "flight_number", nullable = false, length = 10)
    private String flightNumber;

    @Column(name = "departure_from", nullable = false, length = 100)
    private String departureFrom;

    @Column(name = "arrival_to", nullable = false, length = 100)
    private String arrivalTo;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false, length = 100)
    private String airline;

    @Column(length = 20)
    private String duration;

    public Flight() {
    }

    public Flight(String flightNumber, String departureFrom, String arrivalTo,
                  BigDecimal price, String airline, String duration) {
        this.flightNumber = flightNumber;
        this.departureFrom = departureFrom;
        this.arrivalTo = arrivalTo;
        this.price = price;
        this.airline = airline;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public void setDepartureFrom(String departureFrom) {
        this.departureFrom = departureFrom;
    }

    public String getArrivalTo() {
        return arrivalTo;
    }

    public void setArrivalTo(String arrivalTo) {
        this.arrivalTo = arrivalTo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
