package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

  private static final int MOVING_FORWARD = 4;
  private static final int STOP = 3;

  @DisplayName("자동차 움직임 검증 - 전진")
  @Test
  void move_test_forward() {
    Car car = new Car("pobi");
    assertRandomNumberInRangeTest(
            () -> {
              car.move();
              assertEquals(car.getLocation(), 1);
            },
            MOVING_FORWARD
    );
  }

  @DisplayName("자동차 움직임 검증 - 정지")
  @Test
  void move_test_stop() {
    Car car = new Car("pobi");
    assertRandomNumberInRangeTest(
            () -> {
              car.move();
              assertEquals(car.getLocation(), 0);
            },
            STOP
    );
  }

  @DisplayName("자동차 현재 결과 테스트 - 전진")
  @Test
  void get_location_string_forward() {
    Car car = new Car("pobi");
    assertRandomNumberInRangeTest(
            () -> {
              car.move();
              assertEquals(car.getLocationString(), "-");
            },
            MOVING_FORWARD
    );
  }

  @DisplayName("자동차 현재 결과 테스트 - 정지")
  @Test
  void get_location_string_stop() {
    Car car = new Car("pobi");
    assertRandomNumberInRangeTest(
            () -> {
              car.move();
              assertEquals(car.getLocationString(), "");
            },
            STOP
    );
  }




}