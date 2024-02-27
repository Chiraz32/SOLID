package com.directi.training.srp.exercise_ref;


public class CarManager {
    private final CarRepo _carRepo;

    CarManager(CarRepo carRepo) {
        _carRepo = carRepo;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carRepo.getDbCars()) {
            sb.append(car.getName());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _carRepo.getDbCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
