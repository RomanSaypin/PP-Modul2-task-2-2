package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{

    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Toyota", "Mark II", 1997));
        carList.add(new Car("Nissan", "Tiida", 2005));
        carList.add(new Car("Porsche", "Panamera", 2017));
        carList.add(new Car("Mercedes-Benz", "EQS 580", 2022));
        carList.add(new Car("BMW", "M5", 2018));
    }

    @Override
    public List<Car> showCar(int count) {
        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
