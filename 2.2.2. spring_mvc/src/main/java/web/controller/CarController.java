package web.controller;


import Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    List<Car> carList;

    @GetMapping("/cars")
    public String printCarTable(@RequestParam(value = "count", required = false) Integer count, ModelMap carModel) {
        if (count!= null && count >= 0 && count < 5) {
            carModel.addAttribute("carList", carList.subList(0, count));
        } else {
            carModel.addAttribute("carList", carList);
        }

        return "cars";
    }

}
