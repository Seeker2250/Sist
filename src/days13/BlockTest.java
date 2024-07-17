package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class BlockTest {
  static double rate = 0.0;//explicit 클래스 변수
  String name;//인스턴스 변수
  int age;//인스턴스 변수

  BlockTest() {
//    this.name = "익명";
    System.out.println("디폴트 생성자 호출됐다");
  }
  BlockTest(int age) {
//    this.name = "익명";
    System.out.println("디폴트 생성자 호출됐다");
  }
  {
//      인스턴스 초기화 블럭->객체 생성될 때마다 호출 돼
    System.out.println("인스턴스 초기화 블록 {}");
    this.name = "익명";//생성자마다 해야하는데 인스턴스 에서 시키면?
//    생성자가 overloading되어있을 경우, 공통적으로 해야하는 중복된 초기화 코딩이 있다면
//    그 중복되는 초기화 코딩을 instance 초기화 블럭을 선언해서 사용
  }

  static {
//      class(static) 초기화 블럭
//        클래스 변수를 초기화하기 위한 블럭
//        객체 생성과 상관없이 프로그램 시작할 때 한 번 static 초기화 블럭이 실행된다
//        이 안에서 인스턴스 변수는 초기화 할 수 없다.
    System.out.println("클래스 초기화 블록");
    rate = 0.04;
  }

  public static void main(String[] args) {


  }
}
