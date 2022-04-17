package carrace;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public CarRace makeCarRaceByInput() {

        System.out.println("자동차 대수는 몇 대 인가요?");
        int numberOfCars = scanner.nextInt();

        System.out.println("시도할 횟수는 몇 회 인가요?");
        int numberOfRaces = scanner.nextInt();

        return new CarRace(numberOfCars, numberOfRaces);
    }
}
