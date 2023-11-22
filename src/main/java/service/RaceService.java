package service;

import model.Car;
import model.Race;
import util.Converter;

import java.util.ArrayList;
import java.util.List;

public class RaceService {

  private Race race;


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

}
