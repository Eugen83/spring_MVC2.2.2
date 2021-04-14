package web.controller;


import Model.Car;
import Model.CarModel;
/*import Service.ServiceCar;
import Service.ServiceCarImp;
import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {


    CarModel model = new CarModel();

    @GetMapping("/cars")
    public String printCarTable(@RequestParam(defaultValue = "5") Integer count, ModelMap carModel) {
        carModel.addAttribute("carList", model.listCar().stream().limit(count).collect(Collectors.toList()));
        return "cars";
    }

}
