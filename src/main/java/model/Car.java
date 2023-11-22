package model;

import camp.nextstep.edu.missionutils.Randoms;
import constant.NumberConstant;

public class Car {

  private final String name; // 자동차 이름
  private Integer location; // 전진도

  public Car(String name, Integer location) {
    this.name = name;
    this.location = location;
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




}
