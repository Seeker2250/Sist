package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject     abstract
 * @Contents  abstract method : body가 없는 method
 *
 *            abstract class : abstract method를 하나라도 포함 class, 근데 method가 없어도 가능
 *            언제 만드는가 : 공통적인 멤버를 가진 클래스 설계할 때
 *            abstract class는 객체를 만들 수 없어
 *
 *            그럼 method가 없는 애는 abstract class도 되고 그냥 class도 되는데 뭐야?
 *              ->설계자 마음대로인데 abstract로 선언하면 객체를 만들 수 없다는 것만 달라.
 */
public class Ex02 {
  public static void main(String[] args) {

    Parent p = new Child();
    p.dispA();//abstract parent꺼 안 가져오고 child method 가져와
  }
}
abstract class Parent{
//  fields

//  constructor

//  abstract method

  abstract void dispA();
  abstract void dispB();
  abstract void dispC();

//  method


}
class Child extends Parent{
  @Override
  void dispA() {//이것도 body 있으니까 구현된거야(아무 기능 안하는 method라는 뜻)

  }

  @Override
  void dispB() {

  }

  @Override
  void dispC() {

  }
}
