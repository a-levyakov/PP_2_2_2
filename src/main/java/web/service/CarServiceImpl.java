package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getCountOfCars(int count) {
        return getCars().stream().limit(count).collect(Collectors.toList());
    }

    private static List<Car> getCars() {
        List<Car> result = new ArrayList<>();

        result.add(new Car("Bwm", 2011, "black"));
        result.add(new Car("Opel", 1993, "blue"));
        result.add(new Car("Mazda", 2015, "red"));
        result.add(new Car("Kia", 1995, "green"));
        result.add(new Car("Lada", 1990, "orange"));

        return result;
    }
}
