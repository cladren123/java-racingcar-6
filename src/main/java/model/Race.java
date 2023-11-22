package model;

import java.util.List;

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




}
