package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject Final
 * @Contents class 앞-> inheritance 불가
 * method 앞 -> override 불가
 * variable 앞 -> 상수로 변경
 */
public class Ex06 {
  public static void main(String[] args) {
//    final + variable == 상수
    final double PI = 3.1415923565;

    System.out.println(PI);
    FinalTest ft = new FinalTest();
    ft.test(10);
  }//main
}//class

class P {
  final int MAX_VALUE = 1;//명시적 초기화
  final int MIN_VALUE;  //생성자 초기화


  P(int minValue) {
    MIN_VALUE = minValue;
  }

  final int disp() {//override를 못하게 하는 것
    return 0;
  }
}

class C extends P {
  C(int minValue) {
    super(minValue);
  }
//  @Override
//  int disp() {//overriding 불가
//    return 100;
//  }
}

//1) final + class : 자식을 둘 수 없는 최종 class
final class FinalTest {
  //            상수 매개변수 겸 지역변수
  void test(final int n) {
//    n=100; 이런 거 안돼. n은 argument 값 그대로 가져가야해
  }
}
