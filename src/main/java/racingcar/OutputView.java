package racingcar;

public class OutputView {
    void printCarNameRequestMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    void printCountRequestMessage() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    void printResultStartMessage() {
        System.out.println();
        System.out.println("실행 결과");
    }

    void printWinnerStartMessage() {
        System.out.print("최종 우승자 : ");
    }
}
