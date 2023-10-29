package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Game {
    static void chooseWinner(Car[] car) {
        int furthestLocation = getFurthestLocation(car);
        List<String> winners = getWinners(car, furthestLocation);
        OutputView.Winner();
        System.out.println(String.join(", ", winners));
    }
    
    static int getFurthestLocation(Car[] car) {
        int furthestLocation = 0;
        for (int i = 0; i < car.length; i++) {
            if (car[i].getLocation() > furthestLocation) {
                furthestLocation = car[i].getLocation();
            }
        }
        return furthestLocation;
    }
    
    static List<String> getWinners(Car[] car, int furthestLocation) {
        List<String> winners = new ArrayList<>();
        for (int i = 0; i < car.length; i++) {
            if (car[i].getLocation() == furthestLocation) {
                winners.add(car[i].getName());
            }
        }
        return winners;
    }
}
