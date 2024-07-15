package days07;

import com.util.Draw2D;

import static com.util.Draw2D.drawLine;

public class Ex06 {
  public static void main(String[] args) {
//    Class 안에 declare 된 function을 method라고 함

    drawLine();//call a method
    System.out.println("부서명 : 사원명");
    drawLine();
    System.out.println("영업부 : 이시훈");
    System.out.println("생산부 : 송세호");
    System.out.println("총무부 : 김준석");
    System.out.println("자재부 : 김재민");
    drawLine();
  }//main

  //  [접근 제어자][기타 제어자]리턴 자료형 이름([parameter]){
//    statement
//  }

  //  drawLine() method declare
//  public static void drawLine() {
//    System.out.println("-".repeat(30));//줄 그으려고 100줄 썼다고 가정
//  }

  //  method overloading
//  public static void drawLine(int length) {
//    for (int i = 1; i <= length; i++) {
//      System.out.print("-");
//    }
//    System.out.println();
//
//    public static void drawLine(char style, int length){
//      for (int i = 1; i <= length; i++) {
//        System.out.print(style);
//      }
//      System.out.println();
//    }
}
