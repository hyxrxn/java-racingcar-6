package racingcar;

public class Game {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    Cars cars;
    int count;

    void start() {
        setupGameDetails();
        play();
        chooseWinner();
    }

    void setupGameDetails() {
        outputView.printCarNameRequestMessage();
        cars = new Cars(inputView.readCarNames());
        outputView.printCountRequestMessage();
        count = inputView.readCount();
    }

    void play() {
        outputView.printResultStartMessage();
        for (int i = 0; i < count; i++) {
            cars.updateLocation();
            cars.printLocation();
        }
    }

    void chooseWinner() {
        outputView.printWinnerStartMessage();
        cars.chooseWinner();
    }
}
