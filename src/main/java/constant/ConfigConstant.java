package constant;

/**
 * 시스템 상수 구현
 */
public enum ConfigConstant {

  SPLIT_LETTER(",");

  private final String value;

  ConfigConstant(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
