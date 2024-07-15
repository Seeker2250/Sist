package days06;

import java.util.Scanner;

public class Ex03_04 {
  public static void main(String[] args) {
    //[0-9 [0-9] [0-9]
//    \\d\\\d\\d
//    \d{n}하면 n가 온다는 뜻
//    위 세 개는 같은 표현이야
//    \\d*
//    *이 안와도 좋고 여러 개 와도 좋다는 의미
    int kor;
    String strKor = ""; //"0"~"100"
    String regexp = "\\d{1,2}|100";
    Scanner sc = new Scanner(System.in);
//    strKor = sc.next();
//    System.out.println(strKor.matches(regexp));

    int failCount = 0;

    do {
      if (failCount != 0) {
        System.out.println(failCount + "번 실패했어요 3번 되면 빠이");
        if (failCount == 3) {
          System.out.println("이제 빠이");
          break;//프로그램 자체를 종료
        }
      }
      failCount++;
      System.out.println("점수 입력해");
      strKor = sc.next();
    } while (!strKor.matches(regexp));
//맞으면 true-> 반복되니까 ! 붙여주는 것
    kor = Integer.parseInt(strKor);
    System.out.println(kor);
  }
}
//package days06;
//
//    import java.util.Scanner;
//
///**
// * @author kenik
// * @date 2024. 7. 8. - 오전 11:23:21
// * @subject
// * @content
// *
// */
//public class Ex03_04 {
//
//  public static void main(String[] args) {
//
//    int kor;
//    Scanner scanner = new Scanner(System.in);
//    String strKor ;  // "0"~"100"
//    // String regex = "\\d{1,3}";
//    String regex = "\\d{1,2}|100";
//    // [0-9][0-9][0-9]
//    //  \\d\\d\\d
//    //  \\d{3}
//    //  \\d*
//    // {n,m}
//
//    int failCount = 0;
//    do {
//      if ( failCount != 0 ) {
//        System.out.printf("[%d]번 실패!!!\n", failCount);
//        if( failCount == 3 ) {
//          System.out.println("> 오늘은 그만 하자 <");
//          return ;
//        }
//      } // if
//
//      System.out.printf("국어 점수 입력 ? ");
//      strKor = scanner.next();
//      failCount++;
//    } while (  !strKor.matches(regex) );
//
//    kor = Integer.parseInt(strKor);
//
//    System.out.println(   kor );
//
//
//  } // main
//
//} // class









