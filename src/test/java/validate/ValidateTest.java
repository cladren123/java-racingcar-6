package validate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


/**
 * 검증로직 테스트
 */
class ValidateTest {

  @DisplayName("숫자 검증 - 옳은 입력")
  @ValueSource(strings = {"1", "3"})
  @ParameterizedTest
  void validate_number_valid_test(String input) {
    assertDoesNotThrow(() -> Validate.validateNumber(input));
  }

  @DisplayName("숫자 검증 - 에러 발생")
  @ValueSource(strings = {"", "1c", "exception"})
  @ParameterizedTest
  void validate_number_invalid_test(String input) {
    assertThrows(IllegalArgumentException.class, () -> Validate.validateNumber(input));
  }

  @DisplayName("자동차 이름 5글자 이하 검증 - 옳은 입력")
  @ValueSource(strings = {"pobi", "class", "c"})
  @ParameterizedTest
  void validate_car_name_length_valid_test(String input) {
    assertDoesNotThrow(() -> Validate.validateCarNameLength(input));
  }

  @DisplayName("자동차 이름 5글자 이하 검증 - 예외 발생")
  @ValueSource(strings = {"pobies", "classs"})
  @ParameterizedTest
  void validate_car_name_length_invalid_test(String input) {
    assertThrows(IllegalArgumentException.class, () -> Validate.validateCarNameLength(input));
  }

  @DisplayName("공백 검증 - 옳은 입력")
  @ValueSource(strings = {"pobi", "class", "c"})
  @ParameterizedTest
  void validate_blank_valid_test(String input) {
    assertDoesNotThrow(() -> Validate.validateBlank(input));
  }

  @DisplayName("공백 검증 - 예외 발생")
  @Test
  void validate_car_name_length_invalid_test() {
    String input = "";
    assertThrows(IllegalArgumentException.class, () -> Validate.validateBlank(input));
  }






}