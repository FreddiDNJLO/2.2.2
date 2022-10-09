package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class ContrCar {

    private final CarService carService;

    public ContrCar(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {

        if (count == null) {
            model.addAttribute("cars", carService.listCar(5));
        } else if (Integer.parseInt(count) >= 5) {
            model.addAttribute("cars", carService.listCar(5));
        } else {
            model.addAttribute("cars", carService.listCar(Integer.parseInt(count)));
        }
        return "cars";
    }
}
