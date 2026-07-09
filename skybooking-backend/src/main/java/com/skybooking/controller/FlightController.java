package com.skybooking.controller;

import com.skybooking.model.Flight;
import com.skybooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "*") // разрешаем запросы с любого источника, чтобы фронтенд (открытый как файл или на другом порту) не упирался в CORS
public class FlightController {

    private final FlightRepository flightRepository;

    @Autowired
    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    /**
     * GET /api/flights/search?from=Москва&to=Стамбул
     */
    @GetMapping("/search")
    public ResponseEntity<List<Flight>> search(
            @RequestParam String from,
            @RequestParam String to) {

        List<Flight> flights = flightRepository.findByDepartureFromIgnoreCaseAndArrivalToIgnoreCase(from, to);
        return ResponseEntity.ok(flights); // возвращаем 200 даже если список пуст - это не ошибка
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAll() {
        return ResponseEntity.ok(flightRepository.findAll());
    }
}
