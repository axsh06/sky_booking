package com.skybooking.config;

import com.skybooking.model.Flight;
import com.skybooking.repository.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Автоматически заполняет H2 базу тестовыми рейсами при каждом старте приложения,
 * чтобы база не была пустой и поиск сразу возвращал результаты.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    private final FlightRepository flightRepository;

    public DataInitializer(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(String... args) {
        flightRepository.save(new Flight("TK-412", "Москва", "Стамбул",
                new BigDecimal("8900.00"), "Turkish Airlines", "3ч 25м"));

        flightRepository.save(new Flight("SU-208", "Москва", "Стамбул",
                new BigDecimal("10200.00"), "Aeroflot", "3ч 40м"));

        flightRepository.save(new Flight("KC-901", "Астана", "Алматы",
                new BigDecimal("12000.00"), "Air Astana", "1ч 30м"));

        flightRepository.save(new Flight("DV-115", "Астана", "Алматы",
                new BigDecimal("9500.00"), "SCAT Airlines", "1ч 35м"));

        flightRepository.save(new Flight("FZ-750", "Астана", "Дубай",
                new BigDecimal("45000.00"), "FlyDubai", "4ч 10м"));

        flightRepository.save(new Flight("EK-317", "Астана", "Дубай",
                new BigDecimal("52300.00"), "Emirates", "4ч 05м"));

        System.out.println(">>> SkyBooking: тестовые рейсы успешно загружены в H2 (" +
                flightRepository.count() + " шт.)");
    }
}
