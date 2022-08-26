package web.CarDAO;

import web.models.Car;

import java.util.List;

public interface CarDAO {

    public List<Car> show(String count);
}
