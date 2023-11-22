package controller;

import service.RaceService;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Map;

/**
 * 사용자의 입력값으로 서비스를 실행하고 결과값을 반환합니다.
 */

public class RacingCarController {

  private final RaceService raceService = new RaceService();

  /**
   * 경주 게임을 시작합니다.
   */
  public void startRacing() {


  }


  /**
   * 자동차 이름 입력
   */
  public void inputCar() {
    String input = InputView.inputCar();
    raceService.inputCar(input);
  }

  /**
   * 시도할 횟수를 입력 받고 검증된 결과값을 받습니다.
   */
  public void inputTryNumber() {
    String input = InputView.InputTryNumber();
    raceService.inputTryNumber(input);
  }

  /**
   * 레이싱 게임을 진행한 후 결과값을 반환 받아 OutputView로 전달합니다.
   */
  public void racing() {
    Map<Integer, Map<String, String>> round = raceService.round();
    OutputView.printRound(round);
  }

  /**
   * 최종 우승자 값을 반환 받아 OutputView로 전달합니다.
   */
  public void winner() {
    List<String> winner = raceService.winner();
    OutputView.printWinner(winner);
  }




}
