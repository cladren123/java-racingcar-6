package validate;

import constant.ErrorMessage;
import constant.NumberConstant;

/**
 * 검증 작업을 합니다.
 */
public class Validate {

  /**
   * 숫자인지 검증
   */
  public static void validateNumber(String input) {
    try {
      Integer.parseInt(input);
    }
    catch (NumberFormatException e) {
      throw new IllegalArgumentException(ErrorMessage.NUMBER.getMessage());
    }
  }

  /**
   * 자동차 이름이 5글자 이하인지 검증
   */
  public static void validateCarNameLength(String input) {
    if (input.length() > NumberConstant.CAR_SIZE_LIMIT.getNumber()) {
      throw new IllegalArgumentException(ErrorMessage.CAR_NAME.getMessage());
    }
  }

  /**
   * 공백이 들어올 경우 검증
   */
  public static void validateBlank(String input) {
    if(input == null) {
      throw new IllegalArgumentException(ErrorMessage.BLANK.getMessage());
    }
  }

}
