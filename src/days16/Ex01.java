package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject Exception Handling
 * @Contents  1. 프로그램 오류(Error)
 *               프로그램 오작동 / 비정상적으로 종료되는 원인
 *            2. 오류 발생 시점에 따라
 *                1) Compile Error
 *                  javac,exe Hello.java
 *                2) RunTime Error
 *                  java.exe Hello
 *                  int [] m = null;
 *                  m[0] = 100;
 *
 *                   a) Error -> memory 부족, Stack overflow
 *                      복구할 수 없는 심각한 오류
 *                      Error class
 *                   b) Exception -> 개발자가 수습할 수 있는 비교적 덜 심각한 실행 오류
 *                      Exception parents class
 *                                 ㄴchild class
 *
 *            3.  Exception class 상속 계층도
 *               Object
 *
 *                         Throwable interface
 *                  Exception               Error
 *                    ㄴRuntimeException       ㄴOutOfMemoryError
 *                      -개발자 실수로 발생하는 예외
 *                      NullPointException
 *                      ClassCastException
 *                      IndexOutOfBoundException
 *                             :
 *                       ㄴ을 제외한 Exception child class
 *            4. 프로그램 실행 시 발생할 수 있는 예기치 못한 예외에 대비한 코드를 작성하는 것
 *               프로그램의 비정상적 종료를 막고 정상 상태 유지
 *               프로그램이 실행할 때 만약 Exception이 발생하면
 *               JVM이 UncaughtExceptionHandler가 예외를 받아서 원인을 화면에 출력
 *
*             5. 예외처리
 *               1) try-catch 문
 *               2) throws 문
 *
 */
public class Ex01 {
  public static void main(String[] args) {

  }
}
