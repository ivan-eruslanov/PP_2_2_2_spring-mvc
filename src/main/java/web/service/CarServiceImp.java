package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> addCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Vaz", 2106, "$1000"));
        cars.add(new Car("Gaz", 3110, "$1500"));
        cars.add(new Car("Lada", 2109, "$600"));
        cars.add(new Car("Uaz", 3306, "$2000"));
        cars.add(new Car("Kamaz", 4557, "$7000"));
        return cars;
    }

    @Override
    public List<Car> getCarList(Integer count) {
        return addCarList().stream().limit(count).collect(Collectors.toList());
    }
}
