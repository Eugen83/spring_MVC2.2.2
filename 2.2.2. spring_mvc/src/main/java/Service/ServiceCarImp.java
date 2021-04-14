package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceCarImp implements ServiceCar {


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

        if (carCount >= 5 || carCount < 0) {
            return listCar();
        } else {
            return listCar().subList(0, carCount);
        }
    }
}
