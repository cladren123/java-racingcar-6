package constant;

/**
 * 시스템 상수 숫자 관리
 */
public enum NumberConstant {

  CAR_SIZE_LIMIT(5),
  FORWARD_LIMIT(4);
  private final int number;

  NumberConstant(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }
}
