package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCountCarList(Integer count) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Vaz", 2106, "$1000"));
        list.add(new Car("Gaz", 3110, "$1500"));
        list.add(new Car("Lada", 2109, "$600"));
        list.add(new Car("Uaz", 3306, "$2000"));
        list.add(new Car("Kamaz", 4557, "$7000"));

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
