package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> listCar(int count) {
        return carDao.listCar(count);
    }
}
