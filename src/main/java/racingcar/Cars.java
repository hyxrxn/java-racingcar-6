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

    void updateLocation() {
        for (Car car : cars) {
            car.updateLocation();
        }
    }

    void printLocation() {
        for (Car car : cars) {
            car.printLocation();
        }
        System.out.println();
    }
}
