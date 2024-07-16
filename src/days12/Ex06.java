package days12;

/**
 * created by Seeker2250 on 7/16/24.
 *
 * @subject object(with class) 복사(copy)와 객체(with class) 복제(clone)
 * @content
 */
public class Ex06 {
  public static void main(String[] args) {

    Tv t1 = new Tv();
    t1.color = "red";
    System.out.println(t1.color);
    Tv t2 = t1;//class copy / object copy
    t2.color = "blue";
    System.out.println(t1.color);
//    t1이란 object에 members(fields, methods 전부)
//    주소값들은 t1에서 가리키고 있겠지
//    t1.color에 red를 주고
//    t2가 만들어질 때 t1을 대입하면서
//    t2와 t1가 가리키는 곳이 같아짐
//    그래서 실제 instance는 1개지만, 같은 곳을 가리키게 된 것.
//    -> object copy

    tvTest(t1);//t1을 argument로 갔어
    System.out.println(t1.color);

//    이해용
    int[] m = {1, 2, 3};
    mTest(m);
    System.out.println(m[1]);
  }

  private static void tvTest(Tv t) {//object copy(같은 instance 참조)
    t.color = "green";//local variable이지만 argument로 t1을 받아왔으니 같은 주소를 참조하게 되는거지.
    System.out.println(t.color);
  }

  private static void mTest(int[] n) {//사실 이것도 object copy였던거임!!
    n[1] = 100;
  }
}
