package days12;

/**
 * created by Seeker2250 on 7/16/24.
 */
public class Ex03_02 {
  public static void main(String[] args) {
    int[] m = null;
//    System.out.println(m[0]);

//     intance                          object
//      Heap                            stack
//    [0][0][0]                        [0x100]
//      0x100                       m 변수, 참조변수, 배열명
//    null이 되면 참조할 곳이 없는 거(heap area에 instance가 제대로 된 게 없다.
//    주소값이 null이잖아
//    NullPointerException은 instance가 없는 거니까 제대로 생성됐는지 확인해야만 해!


//    이렇게 해서 null을 통해 참조되지 않는 field를 garbage라고 해.
    Tv t1 = null;
    t1 = new Tv();
//    System.out.println(t1.channel);
    tvTest(t1);
  }//main

  private static void tvTest(Tv t1) {//class도 type이야
    System.out.println(t1.channel);
  }
}//class
