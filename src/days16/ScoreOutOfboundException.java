package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
//사용자가 정의한 예외 클래스
//  unchecked 예외
public class ScoreOutOfboundException extends RuntimeException { 
//  예외 코드 번호 : 필드
  private int ERROR_CODE=0;

  public int getERROR_CODE() {
    return ERROR_CODE;
  }
  public ScoreOutOfboundException(String message){
    this(1000, message);
  }

  ScoreOutOfboundException(int error_code, String message){
    super(message);
    this.ERROR_CODE = error_code;
  };
}
