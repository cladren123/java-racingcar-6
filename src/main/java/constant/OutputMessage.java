package constant;

public enum OutputMessage {

  RESULT("실행 결과"),
  ROUND_FORM("%s : %s"),
  WINNER_FORM("최종 우승자 : %s");

  private final String message;

  OutputMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

}
