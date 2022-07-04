package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showSomeAmountCars(@RequestParam(value = "count", defaultValue = "5") Integer amount, Model model) {
        List<Car> attributeModels = new ArrayList<>();

        if (amount == 5) {
            attributeModels = carService.getCars(5);
        } else {
            attributeModels = carService.getCars(amount);
        }
        model.addAttribute("someCars", attributeModels);
        return "cars";
    }
}
