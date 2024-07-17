package days13;

import javax.swing.*;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class Ex10 {
//  fields
  String name = "홍길동";//instance variable, explicit initialization
  static double rate = 0.0;//class variable
  Ex10(){//access modifier가 package인 default constructor
    name = "디폴트";//constructor initialization
  }
  public static void main(String[] args) {
    int age;
//    local variable : 반드시 initialization 해야만 사용할 수 있어
//    class variable
//    instance variable
//    각 type별 default value로 설정되어있음.
//    boolean false;
//    byte, short, int     0
//          long           0L
//    float                0.0F
//    double               0.0    0.0D
//    모든 referenve type   null

//    3. fields(member variable) initialization 방법
//      1) explicit initialization
//          fields 선언할 때 초기값을 주는 것.
//      2) constructor를 통한 initialization 이게 1번보다 강력해
//      3) initialization block {  }
//                a) instance initialization block : instance variable의 초기화를 위해 사용하는 블럭
//                b) class(static) initialization block : class variable의 초기화를 위해 사용하는 블럭
//
    System.out.println("1");
    BlockTest bt1 = new BlockTest();

    System.out.println("2");
    BlockTest bt2 = new BlockTest();

    System.out.println("end");
//    Ex10 obj = new Ex10();
//    System.out.println(obj);
  }//main

}//class
