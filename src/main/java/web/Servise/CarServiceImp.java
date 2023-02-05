package web.Servise;

import org.springframework.stereotype.Service;
import web.CarDAO.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDAO carDAO;

    public static final int DEFAULT_COUNT = 5;

    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public List<Car> show(int count) {
        if (count >= DEFAULT_COUNT) {
            return carDAO.showAll();
        }
        return carDAO.show(count);
    }
}
