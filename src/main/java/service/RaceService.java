package service;

import model.Car;
import model.Race;
import model.TryNumber;
import util.Converter;
import validate.Validate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RaceService {

  private Race race;
  private TryNumber tryNumber;


  /**
   * 자동차 입력
   * @param input
   */
  public void inputCar(String input) {
    Validate.validateBlank(input);
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
    Validate.validateBlank(input);
    Validate.validateNumber(input);
    tryNumber = new TryNumber(Integer.parseInt(input));
  }

  /**
   * 시도할 횟수만큼 자동차를 움직이고 결과값을 저장한 후에 반환.
   */
  public Map<Integer, Map<String, String>> round() {
    Map<Integer, Map<String, String>> result = new LinkedHashMap<>();
    for(int i = 1; i <= tryNumber.getTryNumber(); i++) {
      race.move();
      result.put(i, race.round());
    }
    return result;
  }

  /**
   * 우승자를 계산해 반환합니다.
   */
  public List<String> winner() {
    return race.winner();
  }

}
