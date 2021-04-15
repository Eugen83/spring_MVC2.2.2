package web.controller;


/*import Model.Car;
import Model.CarModel;*/
import Model.Car;
import Service.ServiceCar;
import Service.ServiceCarImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class CarController {

//private ServiceCarImp serviceCar = new ServiceCarImp();

@Autowired
private List<Car> carList;


    @GetMapping("/cars")
    public String printCarTable(@RequestParam(defaultValue = "5") Integer count, ModelMap carModel) {
        carModel.addAttribute("carList", carList.stream().limit(count).collect(Collectors.toList()));
        return "cars";
    }

}
