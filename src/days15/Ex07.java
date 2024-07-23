package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject   Interface
 * @Contents  1. Java Data Tyoe - reference type : Array, class, [interface]
 *            2. 일종의 abstract class
 *            3. abstract level이 더 놓다
 *            4. field declare 불가능
 *               일반 method declare 불가능
 *               상수 & abstract method만 선언 가능
 *               jdk 1.8부터 static method 추가
 *                          default method 추가
 *
 *            5. Abstract class - 미완성 설계도 -> 구현한 자식 클래스
 *               Interface - 기본 설계도(밑그림) -> 구현한 자식 클래스
 *               : Interface 자체만으로 쓰이기 보다는 다른 class를 작성하는 데에 도움을 주는 목적으로 사용된다.
 *
 *            6. Interface Declare Format
 *
 *               [public of default] interface 이름{
 *               상수, abstract method, default method, static method
 *               }이름의 시작은 대문자
 *            7. Interface 안의 모든 member는
 *               public static final(생략 가능)
 *               아무것도 안 붙이면 public abstract(생략 가능)
 *
 *            8. interface끼리 상속이 가능하다.
 *               (extends 사용)
 *            9. interface를 사용하면 다중 상속이 가능하다.
 *            10. class implements interface
 *                해당 interface를 구현한 class
 *            11. Interface 장점
 *                1) 개발 시간 단축
 *                   method가 구현되지 않아도 call 해서 사용 가능하잖아
 *                2) 표준화가 가능하다.
 *                3) 서로 관계없는 클래스인데도 관계를 맺어줄 수 있다.
 *                4) 독립적인 프로그래밍이 가능하다.
 */
public class Ex07 {
  public static void main(String[] args) {

  }//main
}//class
