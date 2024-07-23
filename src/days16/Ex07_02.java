package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex07_02 {
  public static void main(String[] args) {
//    test_String();
//    처리 시간 :1초0489ms26625ns 20만 번 객체가 생성되고 소멸됐어

    test_StringBuilder();
//    처리 시간 612ms6375ns
  }//main

  private static void test_StringBuilder() {
    long start = System.nanoTime();
//    String s = "a";
    StringBuilder s = new StringBuilder("a");
    for (int i = 0; i < 200000; i++) {
//      s += "a";
      s.append("a");
    }
    long end = System.nanoTime();
    System.out.println("처리 시간 "+(end-start));
  }

  private static void test_String(){
    long start = System.nanoTime();
    String s = "a";
    for (int i = 0; i < 200000; i++) {
      s += "a";
    }
    long end = System.nanoTime();
    System.out.println("처리 시간 "+(end-start));
  }
}//class
