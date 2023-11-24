package model;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

  Race race;

  @BeforeEach
  void beforeEach() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("pobi"));
    cars.add(new Car("andew"));
    race = new Race(cars);
  }



}