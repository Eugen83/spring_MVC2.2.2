package web.controller;


import Model.Car;
import Service.ServiceCar;
import Service.ServiceCarImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {


    ServiceCarImp serviceCarImp = new ServiceCarImp();

    @GetMapping("/cars")
    public String printCarTable(@RequestParam(defaultValue = "5") Integer count, ModelMap carModel) {
        carModel.addAttribute("carList", serviceCarImp.returnCars(count));
        return "cars";
    }

}
