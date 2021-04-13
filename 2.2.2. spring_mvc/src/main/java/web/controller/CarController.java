package web.controller;


import Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

@Autowired
    List<Car> carList;

@GetMapping(value = "/cars")
    public String printCarTable(ModelMap carModel){
    carModel.addAttribute("carList", carList);
  return "cars";
  }

}
