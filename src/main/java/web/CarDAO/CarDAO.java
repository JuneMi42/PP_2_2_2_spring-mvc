package web.CarDAO;

import web.models.Car;

import java.util.List;

public interface CarDAO {

    List<Car> show(int count);

    List<Car> showAll();
}
