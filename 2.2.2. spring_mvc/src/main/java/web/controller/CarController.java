package web.controller;



import web.Service.ServiceCar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarController {


    @Autowired
    private ServiceCar serviceCar;


    @GetMapping("/cars")
    public String printCarTable(@RequestParam(defaultValue = "5") Integer count, ModelMap carModel) {
        carModel.addAttribute("carList", serviceCar.returnCars(count));
        return "cars";
    }

}
