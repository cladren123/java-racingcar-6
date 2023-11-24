package util;

import validate.Validate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 변환 메소드 관리
 */
public class Converter {

  /**
   * 입력값을 , 기준으로 나눈 후 반환
   * @param String input
   * @return List<String> result
   */
  public static List<String> inputToCars(String input) {
    return new ArrayList<>(Arrays.asList(input.split(",")));
  }

}
