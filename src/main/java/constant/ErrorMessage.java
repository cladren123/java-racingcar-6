package constant;

public enum ErrorMessage {

  NUMBER("숫자를 입력해야 합니다."),
  CAR_NAME("자동차 이름은 5글자 이하여야 합니다."),
  BLANK("내용을 입력하셔야 합니다.");


  private final String message;

  ErrorMessage(String message) {
    this.message = "[Error] " + message;
  }

  public String getMessage() {
    return message;
  }
}
