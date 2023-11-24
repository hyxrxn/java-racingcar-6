package racingcar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 객체_생성_확인() {
        Car car = new Car("testCar");
        assertThat(car.getName()).isEqualTo("testCar");
        assertThat(car.getLocation()).isEqualTo(0);
    }
}