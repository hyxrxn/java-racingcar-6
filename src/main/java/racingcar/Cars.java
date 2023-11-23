package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

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

    void chooseWinner(){
        int farthestLocation = 0;
        for (Car car : cars) {
            farthestLocation = Math.max(farthestLocation, car.getLocation());
        }
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if(car.getLocation() == farthestLocation){
                winners.add(car.getName());
            }
        }
        System.out.println(String.join(", ", winners));
    }
}
