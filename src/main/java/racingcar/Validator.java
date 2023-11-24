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

    void checkCount(String input) {
        checkInteger(input);
        int reformatInput = Integer.parseInt(input);
        checkNatural(reformatInput);
    }

    void checkInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    void checkNatural(int input) {
        if (input < 1) {
            throw new IllegalArgumentException();
        }
    }
}
