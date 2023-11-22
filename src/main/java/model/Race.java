package model;

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






}
