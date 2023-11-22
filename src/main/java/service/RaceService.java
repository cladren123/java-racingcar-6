package service;

import model.Car;
import model.Race;
import model.TryNumber;
import util.Converter;
import validate.Validate;

import java.util.ArrayList;
import java.util.List;

public class RaceService {

  private Race race;
  private TryNumber tryNumber;


  /**
   * 자동차 입력
   * @param input
   */
  public void inputCar(String input) {
    List<String> splitInput = Converter.inputToCars(input);
    List<Car> cars = new ArrayList<>();
    for(String data : splitInput) {
       cars.add(new Car(data));
    }
    race = new Race(cars);
  }

  /**
   * 시도할 횟수 입력
   */
  public void inputTryNumber(String input) {
    Validate.validateNumber(input);
    tryNumber = new TryNumber(Integer.parseInt(input));
  }

}
