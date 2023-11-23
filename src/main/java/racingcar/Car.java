package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int location;

    Car(String name){
        this.name = name;
        this.location = 0;
    }

    void updateLocation() {
        int number = Randoms.pickNumberInRange(0, 9);
        if (number >= 4) {
            location++;
        }
    }

    void printLocation() {
        System.out.println(name + " : " + "-".repeat(location));
    }

    int getLocation() {
        return location;
    }

    String getName() {
        return name;
    }
}
