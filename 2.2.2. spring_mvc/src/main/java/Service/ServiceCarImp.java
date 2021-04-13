package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceCarImp implements ServiceCar{


    public List<Car> listCar(){
        List<Car> car = new ArrayList<>();
        car.add(new Car("Toyota", "Land Cruiser",100));
        car.add(new Car("Porsche", "Turbo",911));
        car.add(new Car("BMW","X5", 70));
        car.add(new Car("Renault", "Duster", 143));
        car.add(new Car("VAZ","Lada",2109));
        return car;

    }

    @Override
    public List<Car> returnCars(int carCount) {
        List<Car> findListCar = new ArrayList<>();
        if(carCount>=5){
            findListCar = listCar();
        } else {
            for (int i = 0; i<carCount;i++){
                findListCar.add(listCar().get(i));
            }
        }
        return findListCar;
    }
}
