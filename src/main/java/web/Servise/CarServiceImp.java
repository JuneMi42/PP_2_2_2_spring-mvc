package web.Servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.CarDAO.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDAO carDAO;


    @Override
    public List<Car> show(String count) {
        return carDAO.show(count);
    }
}
