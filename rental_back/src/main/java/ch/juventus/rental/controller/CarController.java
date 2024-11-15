package ch.juventus.rental.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
