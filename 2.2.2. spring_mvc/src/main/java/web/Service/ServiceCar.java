package web.Service;

import Model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceCar {
   public List<Car> returnCars(int carCount);
}
