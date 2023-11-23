package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    Cars(String[] names){
        cars = new ArrayList<>();
        for (String name : names){
            cars.add(new Car(name));
        }
    }
}
