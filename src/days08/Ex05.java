package days08;

public class Ex05 {
  public static void main(String[] args) {
//    parameter + method 호출 방법
    drawLine();//    call by name

    System.out.println(hap(10,20));//    call by value
    int a = 10;//
    System.out.println(hap(a,20));// literal이 아니라 이렇게 field가 들어가도 똑같아
//    call by reference
//    call by point -> Java에선 불가능


  }

  public static int hap(int a, int b) {//int a와 b는 local variable
    return a + b;
  }

  public static void drawLine() {
    System.out.println("_____________");
  }
}
