package days07;

public class Ex02_02 {
  public static void main(String[] args) {
//    i = 1  j = 1(*), 2(), 3(), 4() 5(*)
//    i = 2  j = 1(), 2(*), 3(), 4(*) 5()
//    i = 3  j = 1(), 2(), 3(*), 4() 5()
//    i = 4  j = 1(), 2(*), 3(), 4(*) 5()
//    i = 5  j = 1(*), 2(), 3(), 4() 5(*)

    //                  공    별
//      ___*   i=1      3     1
//      __**   i=2      2     2
//      _***   i=3      1     3
//      ****   i=4      0     4
//                    i+j=4
//                    j=4-i   j=i

    for (int i = 1; i <= 4; i++) {  // 행 갯수
      // _ 공백 찍는 for
      for (int j = 1; j <= 4-i; j++) {
        System.out.print("_");
      }
      // 별 찍는 for
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } // for i

    //                 공백    별
//      ****   i=1      0     4
//      _***   i=2      1     3
//      _***   i=3      2     2
//      ___*   i=4      3     1
//                    i-1    i+j=5
//                           j=i-5
//
    for (int i = 1; i <= 4; i++) {  // 행 갯수
      // _ 공백 찍는 for
      for (int j = 1; j <= i-1; j++) {
        System.out.print("_");
      }
      // 별 찍는 for
      for (int k = 1; k <= i-5; k++) {
        System.out.print("*");
      }
      System.out.println();
    } // for i
  }
}
