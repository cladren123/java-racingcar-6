package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

  private static final int MOVING_FORWARD = 4;
  private static final int STOP = 3;
  Race race;


  @BeforeEach
  void beforeEach() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("pobi"));
    cars.add(new Car("andew"));
    race = new Race(cars);
  }

  @DisplayName("결과 취합 반환 테스트")
  @Test
  void round_test() {
    Map<String, String> expected = new LinkedHashMap<>(Map.of(
            "pobi","-",
            "andew",""
    ));
    assertRandomNumberInRangeTest(
            () -> {
              race.move();
              assertEquals(race.round(), expected);
            },
            MOVING_FORWARD, STOP
    );
  }

  @DisplayName("우승자 반환 테스트 - 단일 우승")
  @Test
  void winner_test_single() {
    List<String> expected = new ArrayList<>(List.of("pobi"));
    assertRandomNumberInRangeTest(
            () -> {
              race.move();
              assertEquals(race.winner(), expected);
            },
            MOVING_FORWARD, STOP
    );
  }

  @DisplayName("우승자 반환 테스트 - 공동 우승")
  @Test
  void winner_test_multiple() {
    List<String> expected = new ArrayList<>(List.of("pobi", "andew"));
    assertRandomNumberInRangeTest(
            () -> {
              race.move();
              assertEquals(race.winner(), expected);
            },
            MOVING_FORWARD, MOVING_FORWARD
    );
  }



}