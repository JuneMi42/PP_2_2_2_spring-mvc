package web.CarDAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImp implements CarDAO{
    private final List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car("Toyota", 532, "White"));
        car.add(new Car("Mitsubishi", 347, "Blue"));
        car.add(new Car("Nisan", 753, "Red"));
        car.add(new Car("Reno", 643, "Silver"));
        car.add(new Car("BMW", 352, "Black"));
    }


    @Override
    public List<Car> show(int count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> showAll() {
        return car;
    }
}

