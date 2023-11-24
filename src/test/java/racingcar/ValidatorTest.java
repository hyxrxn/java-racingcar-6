package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ValidatorTest {

    @BeforeEach
    void setUp() {
        Validator validator = new Validator();
    }

    @Test
    void validCarNames() {
        Validator validator = new Validator();
        String[] names = {"car1", "car2", "car3"};
        assertThatCode(() -> validator.checkCarNames(names)).doesNotThrowAnyException();
    }

    @Test
    void invalidCarNames() {
        Validator validator = new Validator();
        String[] names = {"", "car123", " car", "car "};
        assertThatThrownBy(() -> validator.checkCarNames(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void validCount() {
        Validator validator = new Validator();
        String count = "5";
        assertThatCode(() -> validator.checkCount(count)).doesNotThrowAnyException();
    }

    @Test
    void invalidCount() {
        Validator validator = new Validator();
        String count = "0";
        assertThatThrownBy(() -> validator.checkCount(count))
                .isInstanceOf(IllegalArgumentException.class);
    }
}