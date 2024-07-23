package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents
 */
public class Ex10 {
  public static void main(String[] args) {
    //interface : 상수, abstract, static, default method만 가능

  }//mian
}//class

interface Ia {
//  3개의 abstract method가 declare되어있다고 생각
}

interface Ib {
//  1개의 abstract method가 declare되어있다고 생각
}

//interface multiple inheritance
interface Ic extends Ia, Ib {
  //  3개의 abstract method(From Ia)
  //  1개의 abstract method(From Ib)

//  1개의 abstract method(own)

}

class A1 implements Ia {
//  @Override
//  3개의 abstract method(From Ia)
}

class A2 implements Ib {
  //@Override
//  1개의 abstract method(From Ib)
  class A3 implements Ic {
//@Override
//  3개의 abstract method(From Ia)
//  1개의 abstract method(From Ib)
//  1개의 abstract method(From Ic)

    // 1) 디폴트 메서드와 클래스의 메서드가 충돌나면
    ///    ==> 디폴트 메서드는 무시가 된다.
    // 2) 여러 인터페이스를 구현하면
    //  디폴트 메서드와 충돌나면
    //    ==> 충돌나는 디폴트 메서드를 오버라이딩하면 해결.
  }
}