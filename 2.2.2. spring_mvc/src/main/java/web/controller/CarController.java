package web.controller;


/*import Model.Car;
import Model.CarModel;*/
import Service.ServiceCar;
import Service.ServiceCarImp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarController {


ServiceCarImp serviceCar = new ServiceCarImp();

    @GetMapping("/cars")
    public String printCarTable(@RequestParam(defaultValue = "5") Integer count, ModelMap carModel) {
        carModel.addAttribute("carList", serviceCar.returnCars(count));
        return "cars";
    }

}
