package racingcar;

public class Game {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    Cars cars;
    int count;

    void play() {
        setupGameDetails();
    }

    void setupGameDetails(){
        outputView.printCarNameRequestMessage();
        cars = new Cars(inputView.readCarNames());
        outputView.printCountRequestMessage();
        count = inputView.readCount();
    }
}
