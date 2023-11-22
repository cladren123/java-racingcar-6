package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Race {

  private final List<Car> cars;

  public Race(List<Car> cars) {
    this.cars = cars;
  }

  /**
   * Car의 조건이 맞으면 전진합니다.
   */
  public void move() {
    cars.forEach(Car::move);
  }

  /**
   * List의 Car의 현재 결과를 취합해서 반환합니다.
   * @return Map<String,Integer>
   */
  public Map<String, Integer> round() {
    Map<String, Integer> result = new LinkedHashMap<>();
    for(Car car : cars) {
      result.putAll(car.getRound());
    }
    return result;
  }

  /**
   * 우승자를 계산해 반환합니다.
   * @return String
   */
  public List<String> winner() {
    List<String> winner = new ArrayList<>();
    int maxNumber = 0;
    for(Car car : cars) {
      if(maxNumber < car.getLocation()) {
        maxNumber = car.getLocation();
        winner.clear();
        winner.add(car.getName());
      }
      if(maxNumber == car.getLocation()) {
        winner.add(car.getName());
      }
    }
    return winner;
  }






}
