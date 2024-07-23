package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents
 */
public class Ex08 {
  public static void main(String[] args) {
    Idisp a1 = new A();//interface로 up casting 가능
//    a1.disp();//대신 그 메소드만 사용할 수 있어
    Idisp b1 = new B();

    print(a1);
    print(b1);
  }//main
  static void print(Idisp obj) {

  }
}//class
interface Idisp{
  void disp();
}
class A implements Idisp{
  @Override
  public void disp() {
    //구현됐다고 가정
  }
}
class B implements Idisp{
  @Override
  public void disp() {
    //구현됐다고 가정
  }
}