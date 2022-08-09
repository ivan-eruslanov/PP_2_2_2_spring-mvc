package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping
    public String showCars(@RequestParam(defaultValue = "5")Integer count, Model model) {
        List<Car> list = carServiceImp.getCountCarList(count);
        model.addAttribute("cars", list);
        return "cars";
    }
}
