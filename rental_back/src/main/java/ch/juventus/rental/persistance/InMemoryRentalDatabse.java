package ch.juventus.rental.persistance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.juventus.rental.model.Car;

@Repository
public class InMemoryRentalDatabse implements RentalDatabse {

    private List<Car> cars;

    public InMemoryRentalDatabse() {
        cars = new ArrayList<Car>();
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public void addCar(Car newcar) {
        cars.add(newcar);
    }
}
