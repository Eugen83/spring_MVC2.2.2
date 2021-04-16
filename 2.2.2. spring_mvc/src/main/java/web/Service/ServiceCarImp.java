package web.Service;

import Model.Car;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCarImp implements ServiceCar {


    public ServiceCarImp() {
    }

    public List<Car> listCar() {
        List<Car> car = new ArrayList<>();
        car.add(new Car("Toyota", "Land Cruiser", 100));
        car.add(new Car("Porsche", "Turbo", 911));
        car.add(new Car("BMW", "X5", 70));
        car.add(new Car("Renault", "Duster", 143));
        car.add(new Car("VAZ", "Lada", 2109));
        return car;

    }

    @Override
    public List<Car> returnCars(int carCount) {
      return listCar().stream().limit(carCount).collect(Collectors.toList());
    }

}


