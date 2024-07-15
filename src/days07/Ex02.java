package days07;

public class Ex02 {
  public static void main(String[] args) {
//    |\반삼각
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
//    --/반삼각
//    행 갯수  열 갯수(별 갯수)
//    i = 1  j = 1, 2, 3, 4
//    i = 2  j = 2, 3, 4
//    i = 3  j = 3, 4
//    i = 4  j = 4
    for (int i = 1; i < 5; i++) {
      for (int j = 1; j <= 5-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    /*

       ****
       ***
       **
       *

      i+j=5
      j=5-i
       **/
    /*
     * i=4
     * i=3
     * i=2
     * i=1
     * */
    for (int i = 4; i >= 1 ; i--) {      // 행 갯수
      for (int j = 1; j <= i; j++) {   // 별(열) 갯수
        System.out.print("*");
      }
      System.out.println();
    }
        /*
      for (int i = 1; i <= 4 ; i++) {      // 행 갯수
         for (int j = 1; j <= 5-i; j++) {   // 별(열) 갯수
            System.out.print("*");
         }
         System.out.println();
      }
      */

  }
}
