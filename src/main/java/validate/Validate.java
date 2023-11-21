package validate;

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
      throw new IllegalArgumentException();
    }
  }

}
