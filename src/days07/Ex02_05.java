package days07;

public class Ex02_05 {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(i+j>=4 && j-1<=2?"*":" ");
      }
      System.out.println();
    }//outer for

    //      마름모
//
//      __*             (1,3)
//      _***       (2,2)     (2,4)
//      ***** (3,1)               (3,5)
//      _***       (4,2)      (4,4)
//      __*             (5,3)

    for (int i = 1; i <= 5 ; i++) {
      for (int j = 1; j <= 5 ; j++) {
        System.out.print(i+j>=4 && j-i<=2 && i-j<=2 && i+j<=8?"*":"_");

      } // for j
      System.out.println();
    } // for i

//      모래시계
//      *****
//      _***_
//      __*__
//      _***_
//      *****

    System.out.println("_".repeat(30));
    //(1,1) (1, 5) (2, 2) (2,4) (3,3) (4,2) (4,4) (5,1) (5,5)
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print((i<=j && i+j<=6)||(i+j>=6&&i>=j)?"*":"_");
      }
      System.out.println();
    }
  }
}
