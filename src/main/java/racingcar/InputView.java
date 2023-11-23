package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    Validator validator = new Validator();

    String[] readCarNames() {
        String inputNames = Console.readLine();
        String[] parsedInputNames = inputNames.split(",");
        validator.checkCarNames(parsedInputNames);
        return parsedInputNames;
    }
}
