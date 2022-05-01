package carrace.util;

import carrace.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Splitter {
    public List<Car> splitCarNames(String carNames) {
        List<String> carNamesList = List.of(carNames.split("[,]"));

        return carNamesList.stream()
                .map(this::createCar)
                .collect(Collectors.toList());
    }


    private Car createCar(String carName) {
        return new Car(carName);
    }
}
