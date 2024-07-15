package days05;

import static java.sql.Types.NULL;

public class Ex08 {
  public static void main(String[] args) {
/*ASKII code 모두 출력 + for 사용.
* 7bit -> 128문자
* 8bit -> 256문자(확장)
* 0~31 제어 문자
* 32~127 일반 문자(숫자, 대소문자 등)
* 128~255 사선 등 문자
* */

    //문제 : 한 라인에 10개씩 출력하자.
    String [] arr = new String[256];

    for (int i = 0; i < 256; i++) {
      if(i % 10 == 0)
        System.out.print(i/10+1);
      System.out.printf("[%c]", i);
      if(i % 10 == 9)
        System.out.println();
    }
//    1 : 0 1 2 ~ 9개 행
//    2 : 10 ~ 19
//    3 : 20 ~ 29
//    4 : 30 ~ 39
//    5 : 40 ~ 49 ...

//    ->최적화
    for (int i = 0, lineNum = 1; i < 256; i++) {
      if(i % 10 == 0)
        System.out.print(lineNum++);
      System.out.printf("[%c]", i);
      if(i % 10 == 9)
        System.out.println();
    }





//    for (int i = 0; i < 256; i++) {
//      System.out.println((char)i);
//      System.out.printf("%d[%c]\n", i, i);
      //9번은 \t Tab
      //10번 \n LineFeed
//      13번 \r CarrageReturn(CR)

//    }






  }
}
