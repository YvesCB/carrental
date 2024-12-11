package ch.juventus.rental.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import ch.juventus.rental.model.Car;
import ch.juventus.rental.persistance.RentalDatabse;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {
    private final RentalDatabse database;

    public CarController(RentalDatabse database) {
        this.database = database;
    }

    @GetMapping("")
    @ResponseBody
    public List<Car> getCars() {
        return database.getAllCars();
    }

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> createCar(@RequestBody Car newCar) {
        database.addCar(newCar);

        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
}
