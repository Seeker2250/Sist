package days06;

public class Ex06 {
  public static void main(String[] args) {
//    label이 붙은 반복문
//    구구단
    TestGood:for (int dan = 1; dan < 10; dan++) {
      System.out.println("[" + dan + "단]");
      for (int num = 1; num < 10; num++) {
        if(num==5) continue TestGood;
        System.out.print(dan + " * " + num + " = " + dan * num + " ");
      }
      System.out.println();
    }
  }
}
