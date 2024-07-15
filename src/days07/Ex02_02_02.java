package days07;

public class Ex02_02_02 {
  public static void main(String[] args) {
//    i = 1  j = 1(*), 2(), 3(), 4() 5(*)
//    i = 2  j = 1(), 2(*), 3(), 4(*) 5()
//    i = 3  j = 1(), 2(), 3(*), 4() 5()
//    i = 4  j = 1(), 2(*), 3(), 4(*) 5()
//    i = 5  j = 1(*), 2(), 3(), 4() 5(*)

//                     공백    별
//      ___*   i=1      3     1
//      __**   i=2      2     2
//      _***   i=3      1     3
//      ****   i=4      0     4
//                    i+j=4
//                    j=4-i   j=i

    for (int i = 1; i <= 4; i++) { // 행갯수
      for (int j = 1; j <= 4; j++) { // 열갯수
        System.out.print(i + j <= 5 ? "*" : "_");
            /*
            if (i+j<=5) {
               System.out.print("*");
            } else {
               System.out.print("_");
            }
            */
      }
      System.out.println();
    }


//                     공백    별
//      ****   i=1      0     4
//      _***   i=2      1     3
//      _***   i=3      2     2
//      ___*   i=4      3     1
//                    i-1    i+j=5
//                           j=i-5
//
    System.out.println();
    for (int i = 1; i <= 4; i++) { // 행갯수
      for (int j = 1; j <= 4; j++) { // 열갯수
        System.out.print(i + j >= 5 ? "*" : "_");
            /*
            if (i+j<=5) {
               System.out.print("*");
            } else {
               System.out.print("_");
            }
            */
      }
      System.out.println();
    }
//    1,1 1,2 1,3 1,4
//        2,2 2,3 2,4
//            3,3 3,4
//                4,4
    System.out.println();
    for (int i = 1; i <= 4; i++) { // 행갯수
      for (int j = 1; j <= 4; j++) { // 열갯수
        System.out.print(i <= j ? "*" : "_");
            /*
            if (i+j<=5) {
               System.out.print("*");
            } else {
               System.out.print("_");
            }
            */
      }
      System.out.println();
    }
  }
}
