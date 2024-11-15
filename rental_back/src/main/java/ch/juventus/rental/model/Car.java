package ch.juventus.rental.model;

public class Car {
    private int carId;
    private String carName;
    private String brand;
    private int yearOfConstruction;
    private boolean automatic;

    public Car(int carId, String carName, String brand, int yearOfConstruction, boolean automatic) {
        this.carId = carId;
        this.carName = carName;
        this.brand = brand;
        this.yearOfConstruction = yearOfConstruction;
        this.automatic = automatic;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public String getCarName() {
        return carName;
    }
}
