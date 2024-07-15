package days07;

public class Ex02_03 {
  public static void main(String[] args) {
    // 이등변 삼각형
//    i=1일 때 공백 2 __*
//    i=1일 때 공백 1 _***
//    i=1일 때 공백 0 *****
//    *은 1 3 5니까 2n-1
    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j < 3-i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 2*i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
