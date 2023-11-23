package racingcar;

public class Validator {
    void checkCarNames(String[] input) {
        checkLength(input);
        checkSpace(input);
    }

    void checkLength(String[] input) {
        for (String name : input) {
            if (name.length() < 1 || name.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }

    void checkSpace(String[] input) {
        for (String name : input) {
            if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
                throw new IllegalArgumentException();
            }
        }
    }


}
