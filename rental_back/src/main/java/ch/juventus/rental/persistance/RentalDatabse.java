package ch.juventus.rental.persistance;

import java.util.List;

import org.springframework.stereotype.Repository;
import ch.juventus.rental.model.Car;

@Repository
public interface RentalDatabse {
    public List<Car> getAllCars();

    public void addCar(Car newcar);
}
