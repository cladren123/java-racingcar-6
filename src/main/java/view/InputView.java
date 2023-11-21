package view;

import camp.nextstep.edu.missionutils.Console;
import constant.InputMessage;

/**
 * 사용자로부터 경주 할 자동차의 이름과 시도할 회수를 입력 받습니다.
 */
public class InputView {

  /**
   * 자동차 이름을 입력 받습니다.
   * @return : String
   */
  public static String inputCar() {
    System.out.println(InputMessage.CAR_NAME.getMessage());
    return Console.readLine().trim();
  }

}
