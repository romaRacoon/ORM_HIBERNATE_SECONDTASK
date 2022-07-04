package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("Lada",1,2000));
        cars.add(new Car("Bmw", 2, 2001));
        cars.add(new Car("Tayota", 3, 2002));
        cars.add(new Car("Kia", 4, 2003));
        cars.add(new Car("Sedan", 5, 2004));
    }

    @Override
    public List<Car> getCars(int amount) {
        List<Car> returnedList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            returnedList.add(cars.get(i));
        }
        return  returnedList;
    }
}
