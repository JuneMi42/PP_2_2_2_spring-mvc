package web.Servise;

import org.springframework.stereotype.Service;
import web.CarDAO.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDAO carDAO;

    public CarServiceImp(CarDAO carDAO) {
        this.carDAO = carDAO;
    }


    @Override
    public List<Car> show(String count) {
        return carDAO.show(count);
    }
}
