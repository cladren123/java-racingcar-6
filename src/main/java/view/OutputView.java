package view;

import constant.OutputMessage;

import java.util.List;
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
      System.out.println();
    }
  }

  /**
   * 최종 우승자를 출력합니다.
   */
  public static void printWinner(List<String> winners) {
    String winner = String.join(", ", winners);
    System.out.println(String.format(OutputMessage.WINNER_FORM.getMessage(), winner));
  }

}
