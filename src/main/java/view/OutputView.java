package view;

import constant.OutputMessage;

import java.util.Map;

public class OutputView {

  /**
   * 라운드 결과를 출력합니다.
   * @param round
   */
  public static void printRound(Map<Integer, Map<String, String>> round) {
    System.out.println(OutputMessage.RESULT.getMessage());
    for(int roundNumber : round.keySet()) {
      for(String name : round.get(roundNumber).keySet()) {
        System.out.println(String.format(OutputMessage.ROUND_FORM.getMessage(), name, round.get(roundNumber).get(name)));
      }
    }
  }

}
