package days20;


import static days20.Card.*;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject   Enums
 * @Contents  JDK 1.5에 추가된 문법
 *            서로 관련된 상수를 편리하게 사용하기 위한 것
 *            예시) 성별 : 남자 / 여자
 *            여러 타입 gender를 활용하면 곤란해
 *            표준화 하기 위해 Enum 사용
 *            표준화 -> 유지보수, 생산성 향상
 *         3. 열거형 선언 형식
 *            access modifier enum 열거형 이름{
 *              상수명, --대문자 사용
 *              상수명,
 *                :
 *            }
 *         4. 열거형 이름.상수명
 *         5. 열거형은 compile 시 class로 compile
 *            extends java.lang.Enum class 상속
 *         6. Enum 클래스
 *              ㄴ ordinal() : 열거형 상수가 정의된 순서
 *              ㄴ name()    : 열거형 상수명을 문자열로 return
 *              ㄴ valueOf() : name method와 일치하는 열거형 상수를 return
 *
 *
 *
 */
public class Ex10 {
  public static void main(String[] args) {
    System.out.println(CLOVER.ordinal());
    System.out.println(CLOVER.name());
    System.out.println(HEART.ordinal());
    System.out.println(valueOf("HEART"));
    switch (valueOf("DIAMOND")){
      case CLOVER -> {
        System.out.println("a");
        break;
      }
      case HEART -> {
        System.out.println("하트야");
        break;
      }



    }
  }
}
