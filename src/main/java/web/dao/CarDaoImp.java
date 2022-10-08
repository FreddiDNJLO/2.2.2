package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{

    @Override
    public List<Car> listCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", "Red", 1000000));
        cars.add(new Car("BMW", "blue", 700000));
        cars.add(new Car("Lada", "White", 50000));
        cars.add(new Car("Reno", "White", 200000));
        cars.add(new Car("Tesla", "Black", 900000));
        return cars.stream().limit(count).toList();
    }
}
