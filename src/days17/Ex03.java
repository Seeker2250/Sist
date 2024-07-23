package days17;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex03 {
  public static void main(String[] args) {
//    java.lang.Math class
//    Math + 모든 멤버들 : static
//    class.member
    System.out.println(Math.random());
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.min(2, 3));
    System.out.println(Math.max(2, 3));
    System.out.println(Math.abs(-3));
    System.out.println(Math.abs(-3.21));
    System.out.println(Math.PI);
    System.out.println(Math.E);

//    암기
//    올림 == 절상, double
    System.out.println(Math.ceil(2.0));//2.0
    System.out.println(Math.ceil(2.412));//3.0
    System.out.println(Math.ceil(2.651));//3.0
    System.out.println(Math.ceil(1.0123));//2.0

//    반올림, int
    System.out.println(Math.round(2.0));//2
    System.out.println(Math.round(2.412));//2
    System.out.println(Math.round(2.651));//3
    System.out.println(Math.round(1.0123));//1

//    내림 == 절삭,  double
    System.out.println(Math.floor(2.0));//2
    System.out.println(Math.floor(2.412));//2
    System.out.println(Math.floor(2.651));//2
    System.out.println(Math.floor(1.0123));//1


  }//main
}//class
