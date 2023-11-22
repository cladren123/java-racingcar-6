package model;

import camp.nextstep.edu.missionutils.Randoms;
import constant.NumberConstant;
import validate.Validate;

import java.util.LinkedHashMap;
import java.util.Map;

public class Car {

  private final String name; // 자동차 이름
  private Integer location; // 전진도

  public Car(String name) {
    Validate.validateCarNameLength(name);
    this.name = name;
    this.location = NumberConstant.LOCATION_START.getNumber();
  }

  /**
   * 자동차 이름 반환
   * @return String
   * 불변 객체라 값의 변경이 없다.
   */
  public String getName() {
    return name;
  }

  /**
   * 현재 위치 반환
   * @return Integer
   * 불변 객체라 값의 변경이 없다.
   */
  public Integer getLocation() {
    return location;
  }

  /**
   * 무작위 값을 발생시켜 4보다 크면 전진 합니다.
   */
  public void move() {
    int number = Randoms.pickNumberInRange(0, 9);
    if(number > NumberConstant.FORWARD_LIMIT.getNumber()) {
      location += 1;
    }
  }

  /**
   * 현재 결과를 나타냅니다.
   * @return Map<String,Integer>
   */
  public Map<String, Integer> getRound() {
    Map<String, Integer> result = new LinkedHashMap<>();
    result.put(name, location);
    return result;
  }






}
