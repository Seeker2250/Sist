package days20;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject Inner Class(내부 클래스, 중첩 클래스)
 * @Contents class 안에 선언되는 class
 * 장점 : 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
 * 코드 복잡성 감소
 * <p>
 * ex)  class Car {//outer
 * class Engine {//inner
 * <p>
 * }//end of inner
 * } end of outer
 * <p>
 * 내부 클래스 종류
 * instance class->swing, AWT에서 쓰기 때문에 나는 볼 일이 많이 없지 않을까...?
 * static class
 * local class -> 외부 class의 method 내부, 초기화 블록에 선언된 class
 *                method가 실행될 때만 사용할 수 있다
 * anonymous class
 */
public class Ex05 {
  public static void main(String[] args) {

    A a = new A();
    a.disp();
  }//main
}//class

class A {
  private int age;//field

  public void disp() {
    class D{//local class
      D(){}
      int d1;
      void test(){}
    }//local class 선언
    D obj = new D();obj.test();
  }//disp

  public static class C{//static class
//    모든 field, method 선언 가능
    public C(){};
    int c1;
    static int sc1;
    void test1(){}
    static void test2(
//    A.C c = new A.C();
//    c.c1 = 100;
//    c.test1();
//    A.C.test2();//static이라 객체 생성 안해도 돼
//    A.C.sc1 = 200;//static이라 객체 생성 안해도 돼
    ){}
  }

  public class B {//instance class, A class의 객체가 생성되어야만 B객체를 사용할 수 았기 때문.
    B() {
//      static field, static method 선언 불가능
    }

    int b1;

    void test() {
//      A a = new A();
//      A.B b = a.new B();
//      b.b1 = 100;
//      b.test();
    }//END of test method
  }//end of B class
}//end of A class